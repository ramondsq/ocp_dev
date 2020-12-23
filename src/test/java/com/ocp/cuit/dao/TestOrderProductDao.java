package com.ocp.cuit.dao;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class TestOrderProductDao {
    @Resource
    private OrderProductDao orderProductDao;

    @Test
    public void testGetAllStockOrderProducts() {
        System.out.println(orderProductDao.getAllStockOrderProducts());
    }

    @Test
    public void testGetStockOrderProducts() {
        System.out.println(orderProductDao.getStockOrderProducts("202012210001"));
    }

    @Test
    public void testGetAllWholesaleOrderProducts() {
        System.out.println(orderProductDao.getAllWholesaleOrderProducts());
    }

    @Test
    public void testGetWholesaleOrderProducts() {
        System.out.println(orderProductDao.getWholesaleOrderProducts("202012210003"));
    }

}
