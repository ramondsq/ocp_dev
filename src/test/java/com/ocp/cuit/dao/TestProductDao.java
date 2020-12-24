package com.ocp.cuit.dao;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class TestProductDao {
    @Resource
    private ProductDao productDao;

    @Test
    public void testGetAllProducts() {
        System.out.println(productDao.getAllProducts());
    }

    @Test
    public void testGetProductNmae() {
        System.out.println(productDao.getProductName());
    }
}
