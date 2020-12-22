package com.ocp.cuit.pojo;

//运营人员登录信息
public class OperatorLogin {
    private String oplog_user_name;     //用户名
    private String oplog_password;      //密码

    public String getOplog_user_name() {
        return oplog_user_name;
    }

    public void setOplog_user_name(String oplog_user_name) {
        this.oplog_user_name = oplog_user_name;
    }

    public String getOplog_password() {
        return oplog_password;
    }

    public void setOplog_password(String oplog_password) {
        this.oplog_password = oplog_password;
    }
}
