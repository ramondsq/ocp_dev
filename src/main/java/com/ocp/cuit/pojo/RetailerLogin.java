package com.ocp.cuit.pojo;

import org.springframework.stereotype.Component;

@Component
//经销商登录信息
public class RetailerLogin {
    private String rtlog_user_name;     //用户名
    private String rtlog_password;      //密码

    public String getRtlog_user_name() {
        return rtlog_user_name;
    }

    public void setRtlog_user_name(String rtlog_user_name) {
        this.rtlog_user_name = rtlog_user_name;
    }

    public String getRtlog_password() {
        return rtlog_password;
    }

    public void setRtlog_password(String rtlog_password) {
        this.rtlog_password = rtlog_password;
    }
}
