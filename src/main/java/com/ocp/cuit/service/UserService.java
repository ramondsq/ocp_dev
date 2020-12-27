package com.ocp.cuit.service;

import com.ocp.cuit.pojo.OperatorLogin;
import com.ocp.cuit.pojo.Retailer;
import com.ocp.cuit.pojo.RetailerLogin;

import java.util.Map;

public interface UserService {
    Map<String, String> retailerLogin(RetailerLogin retailerLogin);
    Map<String, String> operatorLogin(OperatorLogin operatorLogin);
    Map<String, Object> retailerInfo(Retailer retailer);
}
