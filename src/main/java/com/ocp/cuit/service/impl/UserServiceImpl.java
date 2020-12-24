package com.ocp.cuit.service.impl;

import com.ocp.cuit.dao.UserDao;
import com.ocp.cuit.pojo.OperatorLogin;
import com.ocp.cuit.pojo.RetailerLogin;
import com.ocp.cuit.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserDao userDao;

    @Override
    public Map<String, String> retailerLogin(RetailerLogin retailerLogin) {
        RetailerLogin retailer = userDao.checkRetailerLogin(retailerLogin);

        Map<String, String> map = new HashMap<>();

        if (retailer != null) {
            map.put("code", "1");
            map.put("msg", "成功");
        } else {
            map.put("code", "0");
            map.put("msg", "失败");
        }

        return map;
    }

    @Override
    public Map<String, String> operatorLogin(OperatorLogin operatorLogin) {
        OperatorLogin operator = userDao.checkOperatorLogin(operatorLogin);

        Map<String, String> map = new HashMap<>();

        if (operator != null) {
            map.put("code", "1");
            map.put("msg", "成功");
        } else {
            map.put("code", "0");
            map.put("msg", "失败");
        }

        return map;
    }
}
