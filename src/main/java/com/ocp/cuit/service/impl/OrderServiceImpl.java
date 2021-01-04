package com.ocp.cuit.service.impl;

import com.ocp.cuit.dao.OrderDao;
import com.ocp.cuit.dao.OrderProductDao;
import com.ocp.cuit.dao.UserDao;
import com.ocp.cuit.pojo.Retailer;
import com.ocp.cuit.pojo.StockOrder;
import com.ocp.cuit.pojo.StockOrderProduct;
import com.ocp.cuit.pojo.WholesaleOrder;
import com.ocp.cuit.service.OrderService;
import com.ocp.cuit.vo.RetailerGetAllOrdersVO;
import com.ocp.cuit.vo.SubmitStockOrderProductVO;
import com.ocp.cuit.vo.SubmitStockOrderVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderDao orderDao;

    @Resource
    private UserDao userDao;

    @Resource
    private OrderProductDao orderProductDao;

    @Resource
    private StockOrder stockOrder;
    @Resource
    private StockOrderProduct stockOrderProduct;

//    static int id = 0;

    @Override
    public Map<String, Object> submitStockOrder(SubmitStockOrderVO submitStockOrderVO) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd");
        String dateStr = sdf.format(new Date());

        String order_number = dateStr;

//        if (id < 10) {
//            order_number += "000" + id;
//        } else if (id < 100) {
//            order_number += "00" + id;
//        } else if (id < 1000) {
//            order_number += "0" + id;
//        }
//        ++id;

        stockOrder.setSto_order_number(order_number);
        stockOrder.setSto_invoice_title(submitStockOrderVO.getInvoice_title());      //抬头
        stockOrder.setSto_retailer_id(submitStockOrderVO.getRetailer_id());       //经销商编号
        stockOrder.setSto_out_warehouse_id(submitStockOrderVO.getOut_warehouse_id());  //出货仓库编号
        stockOrder.setSto_in_warehouse_id(submitStockOrderVO.getIn_warehouse_id());   //进货仓库编号
        stockOrder.setSto_pickup_method("配送");      //提货方式
        stockOrder.setSto_period_demand(submitStockOrderVO.getPeriod_demand());        //备货需求时间段
        //stockOrder.setSto_submit_datetime(new Date());      //订单提交日期  数据库自动生成
        stockOrder.setSto_remark(submitStockOrderVO.getRemark());             //备注
        stockOrder.setSto_file_path("");          //文件路径
        stockOrder.setSto_status(0);             //订单状态
        stockOrder.setSto_reason("");             //驳回原因
        stockOrder.setSto_reviewer_user_name("");           //初审人用户名
        stockOrder.setSto_rereviewer_user_name("");         //复核人用户名

        List<SubmitStockOrderProductVO> list = submitStockOrderVO.getProductList();

        int ret1 = orderDao.addNewStockOrder(stockOrder);
        int ret2 = 1;

        stockOrderProduct.setSop_order_id(order_number);
        for (SubmitStockOrderProductVO product : list) {
            stockOrderProduct.setSop_product_id(product.getProduct_id());
            stockOrderProduct.setSop_product_qty(product.getProduct_qty());
            stockOrderProduct.setSop_invoice_price(product.getInvoice_price());
            stockOrderProduct.setSop_total_price(product.getTotal_price());
            stockOrderProduct.setSop_volume(product.getVolume());
            ret2 = orderProductDao.addNewStockOrderProduct(stockOrderProduct);
            if (ret2 == 0) {
                break;
            }
        }

//        System.out.println(submitStockOrderVO);
//        System.out.println(stockOrderProduct);

        Map<String, Object> map = new HashMap<>();

        if (ret1 == 1 && ret2 == 1) {
            map.put("code", 1) ;
        } else {
            map.put("code", 0);
        }

        return map;
    }

    @Override
    public Map<String, Object> submitWSOrder() {
        return null;
    }

    @Override
    public Map<String, Object> getOrders(RetailerGetAllOrdersVO retailerGetAllOrdersVO) {
        Map<String, Object> map = new HashMap<>();

        String username = retailerGetAllOrdersVO.getRtlog_user_name();
        Retailer retailer = new Retailer();
        retailer.setRetailer_name(username);

        List<Map<String, Object>> res = userDao.getRetailer(retailer);

        if (res.size() > 0) {
            StockOrder stockOrder = new StockOrder();
            stockOrder.setSto_retailer_id((Integer) res.get(0).get("retailer_id"));
            stockOrder.setSto_status(retailerGetAllOrdersVO.getSto_status());
            WholesaleOrder wholesaleOrder = new WholesaleOrder();
            wholesaleOrder.setWso_retailer_id((Integer) res.get(0).get("retailer_id"));
            wholesaleOrder.setWso_status(retailerGetAllOrdersVO.getSto_status());

            List<Map<String, Object>> stockOrderMapList = orderDao.getStockOrders(stockOrder);
            List<Map<String, Object>> wholesaleOrderMapList = orderDao.getWholesaleOrders(wholesaleOrder);

            map.put("stock_order", stockOrderMapList);
            map.put("wholesale_order", wholesaleOrderMapList);
            map.put("code", 1);

        } else {
            map.put("code", 0);
        }

        return map;
    }
}
