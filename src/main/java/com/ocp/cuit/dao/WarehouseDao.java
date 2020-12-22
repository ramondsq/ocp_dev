package com.ocp.cuit.dao;

import com.ocp.cuit.pojo.Warehouse;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface WarehouseDao {

    /**
     * 获取所有仓库信息
     * @return 仓库信息列表
     */
    List<Warehouse> getAllWarehouses();
}
