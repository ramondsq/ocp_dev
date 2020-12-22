package com.ocp.cuit.dao;

import com.ocp.cuit.pojo.Operator;
import com.ocp.cuit.pojo.OperatorLogin;
import com.ocp.cuit.pojo.Retailer;
import com.ocp.cuit.pojo.RetailerLogin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class TestUserDao {
    @Autowired
    private UserDao userDao;

    @Resource
    private RetailerLogin retailerLogin;
    @Resource
    private OperatorLogin operatorLogin;
    @Resource
    private Retailer retailer;
    @Resource
    private Operator operator;

    @Test
    public void testCheckRetailerLogin() {
        retailerLogin.setRtlog_user_name("retailer1");
        retailerLogin.setRtlog_password("654321");
        System.out.println(userDao.checkRetailerLogin(retailerLogin).getRtlog_user_name());
        System.out.println(userDao.checkRetailerLogin(retailerLogin).getRtlog_password());
    }

    @Test
    public void testCheckOperatorLogin() {
        operatorLogin.setOplog_user_name("operator1");
        operatorLogin.setOplog_password("123456");
        System.out.println(userDao.checkOperatorLogin(operatorLogin).getOplog_password());
    }

    @Test
    public void testGetAllRetailers() {
        System.out.println(userDao.getAllRetailers());
    }

    @Test
    public void testGetRetailer() {
        //retailer.setRetailer_id(1);
        System.out.println(userDao.getRetailer(retailer));
    }

    @Test
    public void testGetAllRetailerAddress() {
        System.out.println(userDao.getAllRetailerAddress());
    }

    @Test
    public void testGetRetailerAddress() {
        System.out.println(userDao.getRetailerAddress("1"));
    }

    @Test
    public void testGetAllOperators() {
        System.out.println(userDao.getAllOperators());
    }

    @Test
    public void testGetOperators() {
        //operator.setOp_email("operator1@qq.com");
        operator.setOp_gender("男");
        System.out.println(userDao.getOperators(operator));
    }
}
