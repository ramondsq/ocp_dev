package com.ocp.cuit.dao;

import com.ocp.cuit.pojo.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface ProductDao {
    /**
     * 获取所有产品
     * @return 产品列表
     */
    List<Product> getAllProducts();

    /**
     * 获取所有产品的编号和名称
     * @return 所有产品的编号和名称列表
     */
    List<Product> getProductName();
}
