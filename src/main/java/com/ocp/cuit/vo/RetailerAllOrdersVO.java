package com.ocp.cuit.vo;

import org.springframework.stereotype.Component;

@Component
public class RetailerAllOrdersVO {
    private String sto_submit_datetime; //订单提交时间
    private String sto_order_number;    //订单编号
    private String sto_retailer_id;     //经销商编码
    private String sto_status;          //审核状态
    private String sto_remark;          //备注
    private String sto_reason;          //不通过原因
    private String wso_reviewer;        //审核人姓名

    public String getSto_submit_datetime() {
        return sto_submit_datetime;
    }

    public void setSto_submit_datetime(String sto_submit_datetime) {
        this.sto_submit_datetime = sto_submit_datetime;
    }

    public String getSto_order_number() {
        return sto_order_number;
    }

    public void setSto_order_number(String sto_order_number) {
        this.sto_order_number = sto_order_number;
    }

    public String getSto_retailer_id() {
        return sto_retailer_id;
    }

    public void setSto_retailer_id(String sto_retailer_id) {
        this.sto_retailer_id = sto_retailer_id;
    }

    public String getSto_status() {
        return sto_status;
    }

    public void setSto_status(String sto_status) {
        this.sto_status = sto_status;
    }

    public String getSto_remark() {
        return sto_remark;
    }

    public void setSto_remark(String sto_remark) {
        this.sto_remark = sto_remark;
    }

    public String getSto_reason() {
        return sto_reason;
    }

    public void setSto_reason(String sto_reason) {
        this.sto_reason = sto_reason;
    }

    public String getWso_reviewer() {
        return wso_reviewer;
    }

    public void setWso_reviewer(String wso_reviewer) {
        this.wso_reviewer = wso_reviewer;
    }

    @Override
    public String toString() {
        return "RetailerAllOrdersVO{" +
                "sto_submit_datetime='" + sto_submit_datetime + '\'' +
                ", sto_order_number='" + sto_order_number + '\'' +
                ", sto_retailer_id='" + sto_retailer_id + '\'' +
                ", sto_status='" + sto_status + '\'' +
                ", sto_remark='" + sto_remark + '\'' +
                ", sto_reason='" + sto_reason + '\'' +
                ", wso_reviewer='" + wso_reviewer + '\'' +
                '}';
    }
}
