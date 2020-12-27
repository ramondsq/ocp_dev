package com.ocp.cuit.dao;

import com.ocp.cuit.pojo.Warehouse;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class TestWarehouseDao {
    @Resource
    private WarehouseDao warehouseDao;

    @Test
    public void testGetAllWHNameNId() {
        System.out.println(warehouseDao.getAllWHNameNId());
    }
}
