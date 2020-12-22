package com.ocp.cuit.controller;

import com.ocp.cuit.pojo.OperatorLogin;
import com.ocp.cuit.pojo.RetailerLogin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserController {

    /**
     * 经销商登录
     * @param retailerInfo
     * @return loginStatus: 0/1 失败/成功
     */
    @RequestMapping("/retailerLogin")
    public Map<String, String> retailerLogin(RetailerLogin retailerInfo) {
        return null;
    }

    /**
     * 运营商登录
     * @param operatorLogin
     * @return loginStatus: 0/1 失败/成功
     */
    @RequestMapping("/operatorLogin")
    public Map<String, String> operatorLogin(OperatorLogin operatorLogin) {
        return null;
    }
}
