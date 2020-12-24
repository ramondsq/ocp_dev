package com.ocp.cuit.controller;

import com.ocp.cuit.dao.WarehouseDao;
import com.ocp.cuit.pojo.Warehouse;
import com.ocp.cuit.service.WarehouseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class WarehouseController {
    @Resource
    private WarehouseService warehouseService;

    /**
     * 获取所有仓库名
     * @return 所有仓库名
     */
    @RequestMapping("/getAllWarehouses")
    public List<Map<String, Object>> getWarehouses() {
        return warehouseService.getWarehouses();
    }
}
