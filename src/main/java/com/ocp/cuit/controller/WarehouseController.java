package com.ocp.cuit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class WarehouseController {

    /**
     * 获取所有仓库名
     * @return 所有仓库名
     */
    @RequestMapping("/getAllWarehouses")
    public Map<String, String> getAllWarehouses() {
        return null;
    }




}
