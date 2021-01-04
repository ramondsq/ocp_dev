package com.ocp.cuit.dao;

import com.ocp.cuit.pojo.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Mapper
public interface UserDao {

    /**
     * 根据经销商用户名和密码查询表项
     * @param retailerLogin
     * @return 查询结果(用户名和密码 或 null)
     */
    RetailerLogin checkRetailerLogin(RetailerLogin retailerLogin);
    /**
     * 根据运营人员用户名和密码查询表项
     * @return 查询结果(用户名和密码 或 null)
     */
    OperatorLogin checkOperatorLogin(OperatorLogin operatorLogin);





    /**
     * 获取所有经销商信息
     * @return 所有经销商信息列表
     */
    List<Map<String, Object>> getAllRetailers();

    /**
     * 根据条件动态查询经销商信息
     * @param retailer
     * @return 符合条件的经销商信息列表
     */
    List<Map<String, Object>> getRetailer(Retailer retailer);

    /**
     * 获取所有经销商地址信息
     * @return 经销商地址信息列表
     */
    List<Map<String, Object>> getAllRetailerAddress();

    /**
     * 根据经销商编号获取对应地址信息
     * @param retailerId
     * @return 地址信息列表
     */
    List<Map<String, Object>> getRetailerAddress(String retailerId);






   /**
     * 获取所有运营人员的信息
     * @return 运营人员信息列表
     */
   List<Map<String, Object>> getAllOperators();

    /**
     * 根据条件动态查询运营人员的信息
     * @param operator
     * @return 符合条件的运营人员信息列表
     */
   List<Map<String, Object>> getOperators(Operator operator);

}
