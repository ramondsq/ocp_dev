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

    @Override
    public Map<String, Object> getAllWarehouses() {
        List<Warehouse> list = warehouseDao.getAllWarehouses();

        Map<String, Object> map = new HashMap<>();

        if (list.size() > 0) {
            map.put("code", "1");
            map.put("warehouse", list);
            map.put("count", list.size());
        } else {
            map.put("code", "0");
        }

        return map;
    }
}
