package com.ocp.cuit.dao;


import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class TestOrderProductDao {
    @Resource
    private OrderProductDao orderProductDao;
}
