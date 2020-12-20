package com.ocp.cuit.dao;

import com.ocp.cuit.pojo.Operator;
import com.ocp.cuit.pojo.Retailer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface UserDao {
    List<Retailer> getAllRetailers();
    Retailer getRetailerById(Integer id);

    List<Operator> getAllOperators();
}