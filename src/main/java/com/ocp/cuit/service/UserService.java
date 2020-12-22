package com.ocp.cuit.service;

import com.ocp.cuit.pojo.OperatorLogin;
import com.ocp.cuit.pojo.RetailerLogin;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public interface UserService {
    Map<String, String> retailerLogin(RetailerLogin retailerLogin);
    Map<String, String> operatorLogin(OperatorLogin operatorLogin);
}
