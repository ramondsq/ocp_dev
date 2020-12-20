package com.ocp.cuit.dao;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class TestOrderDao {
    @Resource
    private OrderDao orderDao;

    @Test
    public void testGetAllRetailOrders() {
        System.out.println(orderDao.getAllRetailOrders());
    }

    @Test
    public void testGetAllStockOrders() {
        System.out.println(orderDao.getAllStockOrders());
    }

    @Test
    public void testGetAllWholesaleOrders() {
        System.out.println(orderDao.getAllWholesaleOrders());
    }
}
