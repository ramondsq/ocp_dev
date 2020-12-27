package com.ocp.cuit.dao;

import com.ocp.cuit.pojo.Warehouse;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Mapper
public interface WarehouseDao {

//    /**
//     * 获取所有仓库信息
//     * @return 仓库信息列表
//     */
//    List<Warehouse> getAllWarehouses();

    /**
     * 获取所有仓库的编号和名称
     * @return 所有仓库的编号和名称列表
     */
    List<Map<String, Object>> getAllWHNameNId();
}
