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

    @RequestMapping("/getAllWHNameNId")
    public Map<String, Object> getAllWHNameNId() {
        return warehouseService.getAllWHNameNId();
    }
}
