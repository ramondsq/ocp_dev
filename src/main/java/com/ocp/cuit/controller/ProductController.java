package com.ocp.cuit.controller;

import com.ocp.cuit.service.ProductService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@CrossOrigin
@RestController
public class ProductController {
    @Resource
    private ProductService productService;

    /**
     * 获取所有产品信息
     * @return code状态码i(0 or 1), 所有产品的列表
     */
    @RequestMapping("/getAllProducts")
    public Map<String, Object> getAllProducts() {
        return productService.getAllProducts();
    }
}
