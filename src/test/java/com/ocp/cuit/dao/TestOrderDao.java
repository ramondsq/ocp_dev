package com.ocp.cuit.dao;

import com.ocp.cuit.pojo.RetailOrder;
import com.ocp.cuit.pojo.StockOrder;
import com.ocp.cuit.pojo.WholesaleOrder;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class TestOrderDao {
    @Resource
    private OrderDao orderDao;


    @Test
    public void testGetAllStockOrders() {
        System.out.println(orderDao.getAllStockOrders());
    }
    @Test
    public void testGetStockOrders() {
        StockOrder stockOrder = new StockOrder();
        stockOrder.setSto_order_number("202012210002");
        System.out.println(orderDao.getStockOrders(stockOrder));
    }
    @Test
    public void testUpdateStockOrder() {
        StockOrder stockOrder = new StockOrder();
        stockOrder.setSto_order_number("202012210002");
        stockOrder.setSto_status(2);
        System.out.println(orderDao.updateStockOrder(stockOrder));
    }
    @Test
    public void testAddNewStockOrder() {
        StockOrder stockOrder = new StockOrder();
        //stockOrder.setSto_order_number("202012240012");
        //stockOrder.setSto_in_warehouse_id(8);
        //System.out.println(orderDao.addNewStockOrder(stockOrder));
    }
    @Test
    public void testDeleteStockOrder() {
       System.out.println(orderDao.deleteStockOrder("202012240002"));
    }



    @Test
    public void testGetAllWholesaleOrders() {
        System.out.println(orderDao.getAllWholesaleOrders());
    }
    @Test
    public void testGetWholesaleOrders() {
        WholesaleOrder wholesaleOrder = new WholesaleOrder();
//        wholesaleOrder.setWso_order_number("202012210012");
        wholesaleOrder.setWso_status(0);
        System.out.println(orderDao.getWholesaleOrders(wholesaleOrder));
    }
    @Test
    public void testUpdateWholesaleOrder() {
        WholesaleOrder wholesaleOrder = new WholesaleOrder();
        wholesaleOrder.setWso_order_number("202012210012");
        wholesaleOrder.setWso_status(1);
        System.out.println(orderDao.updateWholesaleOrder(wholesaleOrder));
    }
    @Test
    public void testAddNewWholesaleOrder() {
        WholesaleOrder wholesaleOrder = new WholesaleOrder();
        wholesaleOrder.setWso_order_number("202012240997");
//        wholesaleOrder.setWso_status(0);
        System.out.println(orderDao.addNewWholesaleOrder(wholesaleOrder));
    }
    @Test
    public void deleteWholesaleOrder() {
        System.out.println(orderDao.deleteWholesaleOrder("202012240997"));
    }



    @Test
    public void testGetAllRetailOrders() {
        System.out.println(orderDao.getAllRetailOrders());
    }

    @Test
    public void testGetRetailOrders() {
        RetailOrder retailOrder = new RetailOrder();
        retailOrder.setRto_retailer_id(1);
        System.out.println(orderDao.getRetailOrders(retailOrder));
    }

    @Test
    public void testGetOrderDetail() {
        System.out.println(orderDao.getOrderDetail(0, "20210107013602"));
        System.out.println(orderDao.getOrderDetail(1, "20210107013602"));
    }
}
