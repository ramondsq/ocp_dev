package com.ocp.cuit.controller;

import com.ocp.cuit.pojo.OperatorLogin;
import com.ocp.cuit.pojo.Retailer;
import com.ocp.cuit.pojo.RetailerLogin;
import com.ocp.cuit.service.UserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@CrossOrigin
@RestController
public class UserController {
    @Resource
    private UserService userService;
    /**
     * 经销商登录
     * @param retailerInfo
     * @return loginStatus: 0/1 失败/成功
     */
    @RequestMapping(path = "/retailerLogin", method = RequestMethod.POST)
    public Map<String, String> retailerLogin(RetailerLogin retailerInfo) {
        return userService.retailerLogin(retailerInfo);
    }

    /**
     * 获取符合条件的经销商信息
     * @param retailer
     * @return 符合条件的经销商信息列表
     */
    @RequestMapping("/getRetailerInfo")
    public Map<String, Object> getRetailerInfo(Retailer retailer) {
        return userService.retailerInfo(retailer);
    }

    /**
     * 运营商登录
     * @param operatorLogin
     * @return loginStatus: 0/1 失败/成功
     */
    @RequestMapping(path = "/operatorLogin", method = RequestMethod.POST)
    public Map<String, String> operatorLogin(OperatorLogin operatorLogin) {
        return userService.operatorLogin(operatorLogin);
    }
}
