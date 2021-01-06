package com.ocp.cuit.dao;

import com.ocp.cuit.pojo.RetailOrder;
import com.ocp.cuit.pojo.StockOrder;
import com.ocp.cuit.pojo.WholesaleOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

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
    List<Map<String, Object>> getStockOrders(StockOrder stockOrder);
    /**
     * 使用动态查询，更新符合条件的备货订单
     * @param stockOrder
     * @return
     */
    int updateStockOrder(StockOrder stockOrder);
    /**
     * 插入一个备货订单
     * @param stockOrder
     * @return 0失败,1成功
     */
    int addNewStockOrder(StockOrder stockOrder);
    /**
     * 删除一个备货订单
     * @param orderNumber
     */
    int deleteStockOrder(String orderNumber);


    //===================================================


    /**
     * 获取所有批发订单
     * @return  批发订单列表
     */
    List<Map<String, Object>> getAllWholesaleOrders();
    /**
     * 获取符合条件的批发订单
     * @param wholesaleOrder
     * @return 符合条件的批发订单
     */
    List<Map<String, Object>> getWholesaleOrders(WholesaleOrder wholesaleOrder);
    /**
     * 更新符合条件的批发订单
     * @param wholesaleOrder
     * @return
     */
    int updateWholesaleOrder(WholesaleOrder wholesaleOrder);
    /**
     * 插入一个批发订单
     * @param wholesaleOrder
     */
    int addNewWholesaleOrder(WholesaleOrder wholesaleOrder);
    /**
     * 删除一个批发订单
     * @param orderNumber
     */
    int deleteWholesaleOrder(String orderNumber);


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
    List<Map<String, Object>> getRetailOrders(RetailOrder retailOrder);


    /**
     * 获取符合状态条件的订单, tableType=0时查询stockOrder,tableType=1时查询wsOrder
     * @param status
     * @return
     */
    List<Map<String ,Object>> getReviewOrders(@Param("orderType") Integer orderType, @Param("status") Integer status);
}
