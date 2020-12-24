package com.ocp.cuit.service.impl;

import com.ocp.cuit.dao.WarehouseDao;
import com.ocp.cuit.pojo.Warehouse;
import com.ocp.cuit.service.WarehouseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class WarehouseServiceImpl implements WarehouseService {
    @Resource
    private WarehouseDao warehouseDao;

    @Override
    public List<Map<String, Object>> getWarehouses() {
        return warehouseDao.getWarehouses();
    }
}
