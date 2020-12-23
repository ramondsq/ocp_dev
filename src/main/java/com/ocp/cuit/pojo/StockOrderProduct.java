package com.ocp.cuit.pojo;

//备货订单-产品映射
public class StockOrderProduct {
   private String sop_order_id;    //订单编号
   private Integer sop_product_id;     //产品编号
   private Double sop_product_qty;     //产品数量
   private Double sop_invoice_price;   //开票价格
   private Double sop_total_price;     //总金额
   private Double sop_volume;          //总体积

   public String getSop_order_id() {
      return sop_order_id;
   }

   public void setSop_order_id(String sop_order_id) {
      this.sop_order_id = sop_order_id;
   }

   public Integer getSop_product_id() {
      return sop_product_id;
   }

   public void setSop_product_id(Integer sop_product_id) {
      this.sop_product_id = sop_product_id;
   }

   public Double getSop_product_qty() {
      return sop_product_qty;
   }

   public void setSop_product_qty(Double sop_product_qty) {
      this.sop_product_qty = sop_product_qty;
   }

   public Double getSop_invoice_price() {
      return sop_invoice_price;
   }

   public void setSop_invoice_price(Double sop_invoice_price) {
      this.sop_invoice_price = sop_invoice_price;
   }

   public Double getSop_total_price() {
      return sop_total_price;
   }

   public void setSop_total_price(Double sop_total_price) {
      this.sop_total_price = sop_total_price;
   }

   public Double getSop_volume() {
      return sop_volume;
   }

   public void setSop_volume(Double sop_volume) {
      this.sop_volume = sop_volume;
   }

   @Override
   public String toString() {
      return "StockOrderProduct{" +
              "sop_order_id='" + sop_order_id + '\'' +
              ", sop_product_id=" + sop_product_id +
              ", sop_product_qty=" + sop_product_qty +
              ", sop_invoice_price=" + sop_invoice_price +
              ", sop_total_price=" + sop_total_price +
              ", sop_volume=" + sop_volume +
              '}';
   }
}
