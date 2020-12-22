package com.ocp.cuit.pojo;

import java.util.Date;

//备货订单
public class StockOrder {
   private String sto_order_number;      //编号
   private String sto_invoice_title;      //抬头
   private Integer sto_retailer_id;       //经销商编号
   private Integer sto_out_warehouse_id;  //出货仓库编号
   private Integer sto_in_warehouse_id;   //进货仓库编号
   private String sto_pickup_method;      //提货方式
   private Date sto_period_demand;        //备货需求时间段
   private Date sto_submit_datetime;      //订单提交日期
   private String sto_remark;             //备注
   private String sto_file_path;          //文件路径
   private String sto_status;             //订单状态
   private String sto_reason;             //驳回原因
   private String sto_reviewer;           //初审人用户名
   private String sto_rereviewer;         //复核人用户名

   public String getSto_order_number() {
      return sto_order_number;
   }

   public void setSto_order_number(String sto_order_number) {
      this.sto_order_number = sto_order_number;
   }

   public String getSto_invoice_title() {
      return sto_invoice_title;
   }

   public void setSto_invoice_title(String sto_invoice_title) {
      this.sto_invoice_title = sto_invoice_title;
   }

   public Integer getSto_retailer_id() {
      return sto_retailer_id;
   }

   public void setSto_retailer_id(Integer sto_retailer_id) {
      this.sto_retailer_id = sto_retailer_id;
   }

   public Integer getSto_out_warehouse_id() {
      return sto_out_warehouse_id;
   }

   public void setSto_out_warehouse_id(Integer sto_out_warehouse_id) {
      this.sto_out_warehouse_id = sto_out_warehouse_id;
   }

   public Integer getSto_in_warehouse_id() {
      return sto_in_warehouse_id;
   }

   public void setSto_in_warehouse_id(Integer sto_in_warehouse_id) {
      this.sto_in_warehouse_id = sto_in_warehouse_id;
   }

   public String getSto_pickup_method() {
      return sto_pickup_method;
   }

   public void setSto_pickup_method(String sto_pickup_method) {
      this.sto_pickup_method = sto_pickup_method;
   }

   public Date getSto_period_demand() {
      return sto_period_demand;
   }

   public void setSto_period_demand(Date sto_period_demand) {
      this.sto_period_demand = sto_period_demand;
   }

   public Date getSto_submit_datetime() {
      return sto_submit_datetime;
   }

   public void setSto_submit_datetime(Date sto_submit_datetime) {
      this.sto_submit_datetime = sto_submit_datetime;
   }

   public String getSto_remark() {
      return sto_remark;
   }

   public void setSto_remark(String sto_remark) {
      this.sto_remark = sto_remark;
   }

   public String getSto_file_path() {
      return sto_file_path;
   }

   public void setSto_file_path(String sto_file_path) {
      this.sto_file_path = sto_file_path;
   }

   public String getSto_status() {
      return sto_status;
   }

   public void setSto_status(String sto_status) {
      this.sto_status = sto_status;
   }

   public String getSto_reason() {
      return sto_reason;
   }

   public void setSto_reason(String sto_reason) {
      this.sto_reason = sto_reason;
   }

   public String getSto_reviewer() {
      return sto_reviewer;
   }

   public void setSto_reviewer(String sto_reviewer) {
      this.sto_reviewer = sto_reviewer;
   }

   public String getSto_rereviewer() {
      return sto_rereviewer;
   }

   public void setSto_rereviewer(String sto_rereviewer) {
      this.sto_rereviewer = sto_rereviewer;
   }

   @Override
   public String toString() {
      return "StockOrder{" +
              "sto_order_number=" + sto_order_number +
              ", sto_invoice_title='" + sto_invoice_title + '\'' +
              ", sto_retailer_id=" + sto_retailer_id +
              ", sto_out_warehouse_id=" + sto_out_warehouse_id +
              ", sto_in_warehouse_id=" + sto_in_warehouse_id +
              ", sto_pickup_method='" + sto_pickup_method + '\'' +
              ", sto_period_demand=" + sto_period_demand +
              ", sto_submit_datetime=" + sto_submit_datetime +
              ", sto_remark='" + sto_remark + '\'' +
              ", sto_file_path='" + sto_file_path + '\'' +
              ", sto_status='" + sto_status + '\'' +
              ", sto_reason='" + sto_reason + '\'' +
              ", sto_reviewer='" + sto_reviewer + '\'' +
              ", sto_rereviewer='" + sto_rereviewer + '\'' +
              '}';
   }
}
