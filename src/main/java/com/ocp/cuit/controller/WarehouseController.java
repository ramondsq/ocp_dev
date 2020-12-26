package com.ocp.cuit.controller;

import com.ocp.cuit.service.WarehouseService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
public class WarehouseController {
    @Resource
    private WarehouseService warehouseService;

    /**
     * 获取所有仓库名
     * @return 所有仓库名
     */
    @RequestMapping("/getWarehouses")
    public List<Map<String, Object>> getWarehouses() {
        return warehouseService.getWarehouses();
    }

    @RequestMapping("/getAllWarehouses")
    public Map<String, Object> getAllWarehouses() {
        return warehouseService.getAllWarehouses();
    }
}
