package com.ocp.cuit.service.impl;

import com.ocp.cuit.dao.OrderDao;
import com.ocp.cuit.dao.OrderProductDao;
import com.ocp.cuit.dao.UserDao;
import com.ocp.cuit.pojo.*;
import com.ocp.cuit.service.OrderService;
import com.ocp.cuit.vo.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.*;

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

    @Resource
    private WholesaleOrder wholesaleOrder;
    @Resource
    private WholesaleOrderProduct wholesaleOrderProduct;

//    static int id = 0;

    @Override
    public Map<String, Object> submitStockOrder(SubmitStockOrderVO submitStockOrderVO) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd");
        String dateStr = sdf.format(new Date());

        String order_number = dateStr;

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
        stockOrder.setSto_status(submitStockOrderVO.getStatus());             //订单状态
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
    public Map<String, Object> submitWSOrder(SubmitWSOrderVO submitWSOrderVO) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String order_number = sdf.format(new Date());

        //拆分表
        wholesaleOrder.setWso_order_number(order_number);
        wholesaleOrder.setWso_invoice_title(submitWSOrderVO.getInvoice_title());
        wholesaleOrder.setWso_retailer_id(submitWSOrderVO.getRetailer_id());
        wholesaleOrder.setWso_out_warehouse_id(submitWSOrderVO.getOut_warehouse_id());
        wholesaleOrder.setWso_detail_address(submitWSOrderVO.getDetail_address());
        wholesaleOrder.setWso_receiver(submitWSOrderVO.getReceiver());
        wholesaleOrder.setWso_phone(submitWSOrderVO.getPhone());
        wholesaleOrder.setWso_pickup_method(submitWSOrderVO.getPickup_method());
        wholesaleOrder.setWso_submit_datetime(submitWSOrderVO.getSubmit_datetime());
        wholesaleOrder.setWso_remark("");
        wholesaleOrder.setWso_file_path("");
        wholesaleOrder.setWso_status(submitWSOrderVO.getStatus());
        wholesaleOrder.setWso_reviewer_user_name("");
        wholesaleOrder.setWso_rereviewer_user_name("");

        List<SubmitWSOrderProductVO> list = submitWSOrderVO.getProductList();

        int ret1 = orderDao.addNewWholesaleOrder(wholesaleOrder);
        int ret2 = 1;

        wholesaleOrderProduct.setWsop_order_id(order_number);
        for (SubmitWSOrderProductVO product : list) {
            wholesaleOrderProduct.setWsop_product_id(product.getProduct_id());
            wholesaleOrderProduct.setWsop_product_qty(product.getProduct_qty());
            wholesaleOrderProduct.setWsop_invoice_price(product.getInvoice_price());
            wholesaleOrderProduct.setWsop_total_price(product.getTotal_price());
            wholesaleOrderProduct.setWsop_volume(product.getVolume());

            ret2 = orderProductDao.addNewWSOrderProduct(wholesaleOrderProduct);
            if (ret2 == 0) {
                break;
            }
        }

        Map<String, Object> map = new HashMap<>();

        if (ret1 == 1 && ret2 == 1) {
            map.put("code", 1);
        } else {
            map.put("code", 0);
        }

        return map;
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

            if (stockOrderMapList.size() > 0) {
                for (Map<String, Object> m : stockOrderMapList) {
                    System.out.println(m);
                    Iterator iter = m.keySet().iterator();
                    while (iter.hasNext()) {
                        String key = (String) iter.next();
                        if (!key.equals("sto_submit_datetime") && !key.equals("sto_order_number") &&
                            !key.equals("sto_retailer_id") && !key.equals("sto_status") &&
                            !key.equals("sto_remark") && !key.equals("sto_reason") && !key.equals("sto_reviewer")) {
                            iter.remove();
                        }

                    }
                }
            }
            if (wholesaleOrderMapList.size() > 0) {
                for (Map<String, Object> m : wholesaleOrderMapList) {
                    System.out.println(m);
                    Iterator iter = m.keySet().iterator();
                    while (iter.hasNext()) {
                        String key = (String) iter.next();
                        if (!key.equals("wso_submit_datetime") && !key.equals("wso_order_number") &&
                                !key.equals("wso_retailer_id") && !key.equals("wso_status") &&
                                !key.equals("wso_remark") && !key.equals("wso_reason") && !key.equals("wso_reviewer")) {
                            iter.remove();
                        }

                    }
                }

            }
            map.put("stock_order", stockOrderMapList);
            map.put("wholesale_order", wholesaleOrderMapList);
            map.put("code", 1);

        } else {
            map.put("code", 0);
        }

        return map;
    }


    @Override
    public Map<String, Object> getRetailOrderRtr(String rtlog_user_name) {
        Retailer retailer = new Retailer();
        retailer.setRetailer_user_name(rtlog_user_name);
        /* 通过’用户名‘查询'id' */
        List<Map<String, Object>> retailerInfo = userDao.getRetailer(retailer);
        Integer rtid = (Integer) retailerInfo.get(0).get("retailer_id");
        String rtname = retailerInfo.get(0).get("retailer_name").toString();

        RetailOrder retailOrder = new RetailOrder();
        retailOrder.setRto_retailer_id(rtid);

        Map<String, Object> map = new HashMap<>();

        List<Map<String, Object>> list = orderDao.getRetailOrders(retailOrder);

        if(list.size() > 0) {
            map.put("code", "1");
            map.put("retailer_name", rtname);
            map.put("retail_order", list);
        } else {
            map.put("code", "0");
        }

        return map;
    }

    @Override
    public Map<String, Object> submitOrderReview(SubmitOrderReviewVO submitOrderReviewVO) {
        String order_number = submitOrderReviewVO.getOrder_number();
        Integer status = submitOrderReviewVO.getStatus();

        wholesaleOrder.setWso_order_number(order_number);
        wholesaleOrder.setWso_status(status);
        int ret1 = orderDao.updateWholesaleOrder(wholesaleOrder);

        stockOrder.setSto_order_number(order_number);
        stockOrder.setSto_status(status);
        int ret2 = orderDao.updateStockOrder(stockOrder);

        Map<String, Object> map = new HashMap<>();
        if (ret1 == 1 || ret2 == 1) {
            map.put("code", 1);
        } else {
            map.put("code", 0);
        }

        return map;
    }

    @Override
    public Map<String, Object> cancelOrder(String order_number) {
        wholesaleOrder.setWso_order_number(order_number);
        stockOrder.setSto_order_number(order_number);

        int ret1 = orderDao.deleteStockOrder(order_number);
        if (ret1 == 1) {
            orderProductDao.deleteStockOrderProduct(order_number);
        }
        int ret2 = orderDao.deleteWholesaleOrder(order_number);
        if (ret2 == 1) {
            orderProductDao.deleteWSOrderProduct(order_number);
        }

        Map<String, Object> map = new HashMap<>();
        if (ret1 == 1 || ret2 == 1) {
            map.put("code", 1);
        } else {
            map.put("code", 0);
        }

        return map;
    }


    @Override
    public Map<String, Object> getReviewOrders(Integer status) {
        List<Map<String, Object>> sto = orderDao.getReviewOrders(0, status);
        List<Map<String, Object>> wso = orderDao.getReviewOrders(1, status);

        Map<String, Object> map = new HashMap<>();

        map.put("code", 1);
        map.put("sto", sto);
        map.put("wso", wso);

        return map;
    }
}
