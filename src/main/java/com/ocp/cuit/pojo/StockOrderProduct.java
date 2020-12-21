package com.ocp.cuit.pojo;

public class StockOrderProduct {
   private String stp_order_number;
   private Integer stp_product_id;
   private Double stp_product_qty;
   private Double stp_invoice_price;
   private Double stp_total_price;
   private Double stp_volume;

   public String getStp_order_number() {
      return stp_order_number;
   }

   public void setStp_order_number(String stp_order_number) {
      this.stp_order_number = stp_order_number;
   }

   public Integer getStp_product_id() {
      return stp_product_id;
   }

   public void setStp_product_id(Integer stp_product_id) {
      this.stp_product_id = stp_product_id;
   }

   public Double getStp_product_qty() {
      return stp_product_qty;
   }

   public void setStp_product_qty(Double stp_product_qty) {
      this.stp_product_qty = stp_product_qty;
   }

   public Double getStp_invoice_price() {
      return stp_invoice_price;
   }

   public void setStp_invoice_price(Double stp_invoice_price) {
      this.stp_invoice_price = stp_invoice_price;
   }

   public Double getStp_total_price() {
      return stp_total_price;
   }

   public void setStp_total_price(Double stp_total_price) {
      this.stp_total_price = stp_total_price;
   }

   public Double getStp_volume() {
      return stp_volume;
   }

   public void setStp_volume(Double stp_volume) {
      this.stp_volume = stp_volume;
   }

   @Override
   public String toString() {
      return "StockOrderProduct{" +
              "stp_order_number='" + stp_order_number + '\'' +
              ", stp_product_id=" + stp_product_id +
              ", stp_product_qty=" + stp_product_qty +
              ", stp_invoice_price=" + stp_invoice_price +
              ", stp_total_price=" + stp_total_price +
              ", stp_volume=" + stp_volume +
              '}';
   }
}
