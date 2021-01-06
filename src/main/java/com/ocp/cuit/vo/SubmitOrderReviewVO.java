package com.ocp.cuit.vo;

import org.springframework.stereotype.Component;

@Component
public class SubmitOrderReviewVO {
    private String order_number;   //订单编号
    private Integer status;         //审核状态

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SubmitOrderReviewVO{" +
                "order_number='" + order_number + '\'' +
                ", status=" + status +
                '}';
    }
}
