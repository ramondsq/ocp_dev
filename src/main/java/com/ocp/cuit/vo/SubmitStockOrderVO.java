package com.ocp.cuit.vo;

import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class SubmitStockOrderVO {
    private String invoice_title;      //抬头
    private Integer retailer_id;       //经销商编号
    private Integer out_warehouse_id;  //出货仓库编号
    private Integer in_warehouse_id;   //进货仓库编号
    private Date period_demand;        //备货需求时间段
    private Date submit_datetime;      //订单提交日期
    private String remark;             //备注
    private Integer status;
    private List<SubmitStockOrderProductVO> productList; //产品数据

    public Integer getRetailer_id() {
        return retailer_id;
    }

    public void setRetailer_id(Integer retailer_id) {
        this.retailer_id = retailer_id;
    }

    public String getInvoice_title() {
        return invoice_title;
    }

    public void setInvoice_title(String invoice_title) {
        this.invoice_title = invoice_title;
    }

    public Integer getOut_warehouse_id() {
        return out_warehouse_id;
    }

    public void setOut_warehouse_id(Integer out_warehouse_id) {
        this.out_warehouse_id = out_warehouse_id;
    }

    public Integer getIn_warehouse_id() {
        return in_warehouse_id;
    }

    public void setIn_warehouse_id(Integer in_warehouse_id) {
        this.in_warehouse_id = in_warehouse_id;
    }

    public Date getPeriod_demand() {
        return period_demand;
    }

    public void setPeriod_demand(Date period_demand) {
        this.period_demand = period_demand;
    }

    public Date getSubmit_datetime() {
        return submit_datetime;
    }

    public void setSubmit_datetime(Date submit_datetime) {
        this.submit_datetime = submit_datetime;
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

    public List<SubmitStockOrderProductVO> getProductList() {
        return productList;
    }

    public void setProductList(List<SubmitStockOrderProductVO> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "SubmitStockOrderVO{" +
                "invoice_title='" + invoice_title + '\'' +
                ", retailer_id=" + retailer_id +
                ", out_warehouse_id=" + out_warehouse_id +
                ", in_warehouse_id=" + in_warehouse_id +
                ", period_demand=" + period_demand +
                ", submit_datetime=" + submit_datetime +
                ", remark='" + remark + '\'' +
                ", status=" + status +
                ", productList=" + productList +
                '}';
    }
}
