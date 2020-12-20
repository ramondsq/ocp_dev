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
    List<RetailOrder> getAllRetailOrders();
    List<StockOrder> getAllStockOrders();
    List<WholesaleOrder> getAllWholesaleOrders();
}
