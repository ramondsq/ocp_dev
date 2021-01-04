package com.ocp.cuit.vo;

import org.springframework.stereotype.Component;

@Component
public class RetailerGetAllOrdersVO {
    private String rtlog_user_name; //用户名
    private Integer sto_status;     //审核状态

    public String getRtlog_user_name() {
        return rtlog_user_name;
    }

    public void setRtlog_user_name(String rtlog_user_name) {
        this.rtlog_user_name = rtlog_user_name;
    }

    public Integer getSto_status() {
        return sto_status;
    }

    public void setSto_status(Integer sto_status) {
        this.sto_status = sto_status;
    }

    @Override
    public String toString() {
        return "RetailerGetAllOrdersVO{" +
                "rtlog_user_name='" + rtlog_user_name + '\'' +
                ", sto_status=" + sto_status +
                '}';
    }
}
