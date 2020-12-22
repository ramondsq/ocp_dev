package com.ocp.cuit.dao;

import com.ocp.cuit.pojo.RetailOrder;
import com.ocp.cuit.pojo.StockOrder;
import com.ocp.cuit.pojo.WholesaleOrder;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface OrderDao {

    /**
     * 获取所有备货订单
     * @return 备货订单列表
     */
    List<StockOrder> getAllStockOrders();
    /**
     * 使用动态查询，获取符合条件的备货订单
     * @param stockOrder
     * @return 符合条件的备货订单
     */
    List<StockOrder> getStockOrders(StockOrder stockOrder);
    /**
     * 插入一个备货订单
     * @param stockOrder
     */
    void addNewStockOrder(StockOrder stockOrder);
    /**
     * 删除一个备货订单
     * @param orderNumber
     */
    void deleteStockOrder(String orderNumber);


    //===================================================


    /**
     * 获取所有批发订单
     * @return  批发订单列表
     */
    List<WholesaleOrder> getAllWholesaleOrders();

    /**
     * 获取符合条件的批发订单
     * @param wholesaleOrder
     * @return 符合条件的批发订单
     */
    List<WholesaleOrder> getWholesaleOrders(WholesaleOrder wholesaleOrder);

    /**
     * 插入一个批发订单
     * @param wholesaleOrder
     */
    void addNewWholesaleOrder(WholesaleOrder wholesaleOrder);

    /**
     * 删除一个批发订单
     * @param orderNumber
     */
    void deleteWholesaleOrder(String orderNumber);


    //====================================================


    /**
     * 获取所有零售订单
     * @return 零售订单列表
     */
    List<RetailOrder> getAllRetailOrders();

    /**
     * 使用动态查询，获取符合条件的零售订单
     * @param retailOrder
     * @return 符合条件的零售订单
     */
    List<RetailOrder> getRetailOrders(RetailOrder retailOrder);
}
