package com.ocp.cuit.vo;

import java.util.Date;
import java.util.List;

public class SubmitWSOrderVO {
    private String invoice_title;      //抬头
    private Integer retailer_id;       //经销商编号
    private Integer out_warehouse_id;  //出货仓库编号
    private Date submit_datetime;      //订单提交日期
    private String detail_address;      //详细送货地址
    private String receiver;            //收货人
    private String phone;               //联系电话
    private String pickup_method;        //提货方式
    private String remark;             //备注
    private Integer status;             //订单状态
    private List<SubmitWSOrderProductVO> productList; //产品数据

    public String getInvoice_title() {
        return invoice_title;
    }

    public void setInvoice_title(String invoice_title) {
        this.invoice_title = invoice_title;
    }

    public Integer getRetailer_id() {
        return retailer_id;
    }

    public void setRetailer_id(Integer retailer_id) {
        this.retailer_id = retailer_id;
    }

    public Integer getOut_warehouse_id() {
        return out_warehouse_id;
    }

    public void setOut_warehouse_id(Integer out_warehouse_id) {
        this.out_warehouse_id = out_warehouse_id;
    }

    public Date getSubmit_datetime() {
        return submit_datetime;
    }

    public void setSubmit_datetime(Date submit_datetime) {
        this.submit_datetime = submit_datetime;
    }

    public String getDetail_address() {
        return detail_address;
    }

    public void setDetail_address(String detail_address) {
        this.detail_address = detail_address;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPickup_method() {
        return pickup_method;
    }

    public void setPickup_method(String pickup_method) {
        this.pickup_method = pickup_method;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public List<SubmitWSOrderProductVO> getProductList() {
        return productList;
    }

    public void setProductList(List<SubmitWSOrderProductVO> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "SubmitWSOrderVO{" +
                "invoice_title='" + invoice_title + '\'' +
                ", retailer_id=" + retailer_id +
                ", out_warehouse_id=" + out_warehouse_id +
                ", submit_datetime=" + submit_datetime +
                ", detail_address='" + detail_address + '\'' +
                ", receiver='" + receiver + '\'' +
                ", phone='" + phone + '\'' +
                ", pickup_method='" + pickup_method + '\'' +
                ", remark='" + remark + '\'' +
                ", status=" + status +
                ", productList=" + productList +
                '}';
    }
}
