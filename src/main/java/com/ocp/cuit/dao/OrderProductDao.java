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
     * @param orderNumber
     * @return
     */
    List<StockOrderProduct> getStockOrderProducts(String orderNumber);


    /**
     * 获取所有批发订单-产品映射表项
     * @return
     */
    List<WholesaleOrderProduct> getAllWholesaleOrderProducts();


    /**
     * 获取订单号对应的批发订单-产品映射表项
     * @param orderNumber
     * @return
     */
    List<WholesaleOrderProduct> getWholesaleOrderProducts(String orderNumber);
}
