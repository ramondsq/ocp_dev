package com.ocp.cuit.vo;

import org.springframework.stereotype.Component;

@Component
public class InquireOrdersVO {
    private String retailer_id;
    private String retailer_name;
    private String order_number;
    private String submit_datetime;
    private Integer status;

    public String getRetailer_id() {
        return retailer_id;
    }

    public void setRetailer_id(String retailer_id) {
        this.retailer_id = retailer_id;
    }

    public String getRetailer_name() {
        return retailer_name;
    }

    public void setRetailer_name(String retailer_name) {
        this.retailer_name = retailer_name;
    }

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number;
    }

    public String getSubmit_datetime() {
        return submit_datetime;
    }

    public void setSubmit_datetime(String submit_datetime) {
        this.submit_datetime = submit_datetime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "InquireStockOrders{" +
                "retailer_id='" + retailer_id + '\'' +
                ", retailer_name='" + retailer_name + '\'' +
                ", order_number='" + order_number + '\'' +
                ", submit_datetime=" + submit_datetime +
                ", status=" + status +
                '}';
    }
}
