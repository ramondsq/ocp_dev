package com.ocp.cuit.pojo;

import java.util.Date;

public class StockOrder {
   private Integer sto_order_number;
   private String sto_invoice_title;
   private Integer sto_retailer_id;
   private Integer sto_out_warehouse_id;
   private Integer sto_in_warehouse_id;
   private String sto_pickup_method;
   private Date sto_period_demand;
   private Date sto_submit_datetime;
   private String sto_remark;
   private Integer sto_product_id;
   private Double sto_product_qty;
   private Double sto_invoice_price;
   private Double sto_total_price;
   private Double sto_volume;
   private String sto_file_path;
   private String sto_status;
   private String sto_reason;
   private String sto_reviewer;

   public Integer getSto_order_number() {
      return sto_order_number;
   }

   public void setSto_order_number(Integer sto_order_number) {
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

   public Integer getSto_product_id() {
      return sto_product_id;
   }

   public void setSto_product_id(Integer sto_product_id) {
      this.sto_product_id = sto_product_id;
   }

   public Double getSto_product_qty() {
      return sto_product_qty;
   }

   public void setSto_product_qty(Double sto_product_qty) {
      this.sto_product_qty = sto_product_qty;
   }

   public Double getSto_invoice_price() {
      return sto_invoice_price;
   }

   public void setSto_invoice_price(Double sto_invoice_price) {
      this.sto_invoice_price = sto_invoice_price;
   }

   public Double getSto_total_price() {
      return sto_total_price;
   }

   public void setSto_total_price(Double sto_total_price) {
      this.sto_total_price = sto_total_price;
   }

   public Double getSto_volume() {
      return sto_volume;
   }

   public void setSto_volume(Double sto_volume) {
      this.sto_volume = sto_volume;
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
              ", sto_product_id=" + sto_product_id +
              ", sto_product_qty=" + sto_product_qty +
              ", sto_invoice_price=" + sto_invoice_price +
              ", sto_total_price=" + sto_total_price +
              ", sto_volume=" + sto_volume +
              ", sto_file_path='" + sto_file_path + '\'' +
              ", sto_status='" + sto_status + '\'' +
              ", sto_reason='" + sto_reason + '\'' +
              ", sto_reviewer='" + sto_reviewer + '\'' +
              '}';
   }
}
