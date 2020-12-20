package com.ocp.cuit.dao;

import com.ocp.cuit.pojo.Warehouse;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface WarehouseDao {
    List<Warehouse> getAllWarehouses();
}
