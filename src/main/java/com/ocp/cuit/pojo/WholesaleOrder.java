package com.ocp.cuit.pojo;

import java.util.Date;

public class WholesaleOrder {
   private Integer wso_order_number;
   private Date wso_submit_datetime;
   private String wso_invoice_title;
   private Integer wso_retailer_id;
   private Integer wso_out_warehouse_id;
   private String wso_detail_address;
   private String wso_receiver;
   private String wso_phone;
   private String wso_pickup_method;
   private String wso_remark;
   private Integer wso_product_id;
   private Double wso_product_qty;
   private Double wso_invoice_price;
   private Double wso_total_price;
   private Double wso_volume;
   private String wso_file_path;
   private String wso_status;
   private String wso_reason;
   private String wso_reviewer;

   public Integer getWso_order_number() {
      return wso_order_number;
   }

   public void setWso_order_number(Integer wso_order_number) {
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

   public Integer getWso_product_id() {
      return wso_product_id;
   }

   public void setWso_product_id(Integer wso_product_id) {
      this.wso_product_id = wso_product_id;
   }

   public Double getWso_product_qty() {
      return wso_product_qty;
   }

   public void setWso_product_qty(Double wso_product_qty) {
      this.wso_product_qty = wso_product_qty;
   }

   public Double getWso_invoice_price() {
      return wso_invoice_price;
   }

   public void setWso_invoice_price(Double wso_invoice_price) {
      this.wso_invoice_price = wso_invoice_price;
   }

   public Double getWso_total_price() {
      return wso_total_price;
   }

   public void setWso_total_price(Double wso_total_price) {
      this.wso_total_price = wso_total_price;
   }

   public Double getWso_volume() {
      return wso_volume;
   }

   public void setWso_volume(Double wso_volume) {
      this.wso_volume = wso_volume;
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

   public String getWso_reviewer() {
      return wso_reviewer;
   }

   public void setWso_reviewer(String wso_reviewer) {
      this.wso_reviewer = wso_reviewer;
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
              ", wso_product_id=" + wso_product_id +
              ", wso_product_qty=" + wso_product_qty +
              ", wso_invoice_price=" + wso_invoice_price +
              ", wso_total_price=" + wso_total_price +
              ", wso_volume=" + wso_volume +
              ", wso_file_path='" + wso_file_path + '\'' +
              ", wso_status='" + wso_status + '\'' +
              ", wso_reason='" + wso_reason + '\'' +
              ", wso_reviewer='" + wso_reviewer + '\'' +
              '}';
   }
}
