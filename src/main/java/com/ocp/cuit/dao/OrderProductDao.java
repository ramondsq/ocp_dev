package com.ocp.cuit.dao;

import com.ocp.cuit.pojo.StockOrderProduct;
import com.ocp.cuit.pojo.WholesaleOrderProduct;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface OrderProductDao {
    /**
     * 获取所有备货订单-产品映射表项
     * @return
     */
    List<StockOrderProduct> getAllStockOrderProducts();

    /**
     * 获取订单号对应的备货订单-产品映射表项
     * @param orderId
     * @return
     */
    List<StockOrderProduct> getStockOrderProducts(String orderId);

    /**
     * 新增一条备货订单-产品映射项
     * @param stockOrderProduct
     * @return
     */
    int addNewStockOrderProduct(StockOrderProduct stockOrderProduct);

    /**
     * 删除一条备货订单-产品映射表项
     * @param orderId
     * @return
     */
    int deleteStockOrderProduct(String orderId);


    /**
     * 获取所有批发订单-产品映射表项
     * @return
     */
    List<WholesaleOrderProduct> getAllWholesaleOrderProducts();


    /**
     * 获取订单号对应的批发订单-产品映射表项
     * @param orderId
     * @return
     */
    List<WholesaleOrderProduct> getWholesaleOrderProducts(String orderId);

    /**
     * 新增一条批发订单-产品映射表项
     * @param wholesaleOrderProduct
     * @return 成功1 失败0
     */
    int addNewWSOrderProduct(WholesaleOrderProduct wholesaleOrderProduct);

    /**
     * 删除一条批发-产品映射表项
     * @param orderId
     * @return
     */
    int deleteWSOrderProduct(String orderId);
}
