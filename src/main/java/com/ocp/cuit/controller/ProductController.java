package com.ocp.cuit.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ProductController {
    /**
     * 获取所有产品信息
     * @return code状态码i(0 or 1), 所有产品的列表
     */
    @RequestMapping("getAllProducts")
    public Map<String, String> getAllProducts() {
        return null;
    }
}
