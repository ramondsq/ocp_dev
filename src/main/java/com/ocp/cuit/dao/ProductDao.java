package com.ocp.cuit.dao;

import com.ocp.cuit.pojo.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface ProductDao {
    List<Product> getAllProducts();
}
