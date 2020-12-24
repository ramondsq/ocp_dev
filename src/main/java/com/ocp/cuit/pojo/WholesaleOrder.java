package com.ocp.cuit.pojo;

import java.util.Date;

public class WholesaleOrder {
   private String wso_order_number;         //订单编号
   private Date wso_submit_datetime;         //订单提交时间
   private String wso_invoice_title;         //抬头
   private Integer wso_retailer_id;          //经销商编号
   private Integer wso_out_warehouse_id;     //出货仓库编号
   private String wso_detail_address;        //详细送货地址
   private String wso_receiver;              //收货人
   private String wso_phone;                 //手机号
   private String wso_pickup_method;         //提货方式
   private String wso_remark;                //备注
   private String wso_file_path;             //文件路径
   private String wso_status;                //订单状态
   private String wso_reason;                //驳回原因
   private String wso_reviewer_user_name;              //初审人用户名
   private String wso_rereviewer_user_name;            //复核人用户名

   public String getWso_order_number() {
      return wso_order_number;
   }

   public void setWso_order_number(String wso_order_number) {
      this.wso_order_number = wso_order_number;
   }

   public Date getWso_submit_datetime() {
      return wso_submit_datetime;
   }

   public void setWso_submit_datetime(Date wso_submit_datetime) {
      this.wso_submit_datetime = wso_submit_datetime;
   }

   public String getWso_invoice_title() {
      return wso_invoice_title;
   }

   public void setWso_invoice_title(String wso_invoice_title) {
      this.wso_invoice_title = wso_invoice_title;
   }

   public Integer getWso_retailer_id() {
      return wso_retailer_id;
   }

   public void setWso_retailer_id(Integer wso_retailer_id) {
      this.wso_retailer_id = wso_retailer_id;
   }

   public Integer getWso_out_warehouse_id() {
      return wso_out_warehouse_id;
   }

   public void setWso_out_warehouse_id(Integer wso_out_warehouse_id) {
      this.wso_out_warehouse_id = wso_out_warehouse_id;
   }

   public String getWso_detail_address() {
      return wso_detail_address;
   }

   public void setWso_detail_address(String wso_detail_address) {
      this.wso_detail_address = wso_detail_address;
   }

   public String getWso_receiver() {
      return wso_receiver;
   }

   public void setWso_receiver(String wso_receiver) {
      this.wso_receiver = wso_receiver;
   }

   public String getWso_phone() {
      return wso_phone;
   }

   public void setWso_phone(String wso_phone) {
      this.wso_phone = wso_phone;
   }

   public String getWso_pickup_method() {
      return wso_pickup_method;
   }

   public void setWso_pickup_method(String wso_pickup_method) {
      this.wso_pickup_method = wso_pickup_method;
   }

   public String getWso_remark() {
      return wso_remark;
   }

   public void setWso_remark(String wso_remark) {
      this.wso_remark = wso_remark;
   }

   public String getWso_file_path() {
      return wso_file_path;
   }

   public void setWso_file_path(String wso_file_path) {
      this.wso_file_path = wso_file_path;
   }

   public String getWso_status() {
      return wso_status;
   }

   public void setWso_status(String wso_status) {
      this.wso_status = wso_status;
   }

   public String getWso_reason() {
      return wso_reason;
   }

   public void setWso_reason(String wso_reason) {
      this.wso_reason = wso_reason;
   }

   public String getWso_reviewer_user_name() {
      return wso_reviewer_user_name;
   }

   public void setWso_reviewer_user_name(String wso_reviewer_user_name) {
      this.wso_reviewer_user_name = wso_reviewer_user_name;
   }

   public String getWso_rereviewer_user_name() {
      return wso_rereviewer_user_name;
   }

   public void setWso_rereviewer_user_name(String wso_rereviewer_user_name) {
      this.wso_rereviewer_user_name = wso_rereviewer_user_name;
   }

   @Override
   public String toString() {
      return "WholesaleOrder{" +
              "wso_order_number=" + wso_order_number +
              ", wso_submit_datetime=" + wso_submit_datetime +
              ", wso_invoice_title='" + wso_invoice_title + '\'' +
              ", wso_retailer_id=" + wso_retailer_id +
              ", wso_out_warehouse_id=" + wso_out_warehouse_id +
              ", wso_detail_address='" + wso_detail_address + '\'' +
              ", wso_receiver='" + wso_receiver + '\'' +
              ", wso_phone='" + wso_phone + '\'' +
              ", wso_pickup_method='" + wso_pickup_method + '\'' +
              ", wso_remark='" + wso_remark + '\'' +
              ", wso_file_path='" + wso_file_path + '\'' +
              ", wso_status='" + wso_status + '\'' +
              ", wso_reason='" + wso_reason + '\'' +
              ", wso_reviewer='" + wso_reviewer_user_name + '\'' +
              ", wso_rereviewer='" + wso_rereviewer_user_name + '\'' +
              '}';
   }
}
