package com.ocp.cuit.service.impl;

import com.ocp.cuit.dao.ProductDao;
import com.ocp.cuit.pojo.Product;
import com.ocp.cuit.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    private ProductDao productDao;

    public Map<String, Object> getAllProducts() {
        List<Product> list = productDao.getAllProducts();
        Map<String, Object> map = new HashMap<>();

        if (list.size() > 0) {
            map.put("products", list);
            map.put("code", "1");
        } else {
            map.put("code", "0");
        }

        return map;
    }

}
