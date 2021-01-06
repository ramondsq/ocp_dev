package com.ocp.cuit.vo;

import org.springframework.stereotype.Component;

@Component
public class ReviewOrderVO {
    private String order_number;
    private Integer status;
    private String reason;
    private String reviewer_user_name;
    private String rereviewer_user_name;

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

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getReviewer_user_name() {
        return reviewer_user_name;
    }

    public void setReviewer_user_name(String reviewer_user_name) {
        this.reviewer_user_name = reviewer_user_name;
    }

    public String getRereviewer_user_name() {
        return rereviewer_user_name;
    }

    public void setRereviewer_user_name(String rereviewer_user_name) {
        this.rereviewer_user_name = rereviewer_user_name;
    }

    @Override
    public String toString() {
        return "ReviewOrderVO{" +
                "order_number='" + order_number + '\'' +
                ", status='" + status + '\'' +
                ", reason='" + reason + '\'' +
                ", reviewer_user_name='" + reviewer_user_name + '\'' +
                ", rereviewer_user_name='" + rereviewer_user_name + '\'' +
                '}';
    }
}
