package com.ocp.cuit.pojo;

//批发订单-产品映射
public class WholesaleOrderProduct {
   private String wsp_order_number;    //订单编号
   private Integer wsp_product_id;     //产品编号
   private Double wsp_product_qty;     //数量
   private Double wsp_invoice_price;   //开票价格
   private Double wsp_total_price;     //总金额
   private Double wsp_volume;          //总体积

   public String getWsp_order_number() {
      return wsp_order_number;
   }

   public void setWsp_order_number(String wsp_order_number) {
      this.wsp_order_number = wsp_order_number;
   }

   public Integer getWsp_product_id() {
      return wsp_product_id;
   }

   public void setWsp_product_id(Integer wsp_product_id) {
      this.wsp_product_id = wsp_product_id;
   }

   public Double getWsp_product_qty() {
      return wsp_product_qty;
   }

   public void setWsp_product_qty(Double wsp_product_qty) {
      this.wsp_product_qty = wsp_product_qty;
   }

   public Double getWsp_invoice_price() {
      return wsp_invoice_price;
   }

   public void setWsp_invoice_price(Double wsp_invoice_price) {
      this.wsp_invoice_price = wsp_invoice_price;
   }

   public Double getWsp_total_price() {
      return wsp_total_price;
   }

   public void setWsp_total_price(Double wsp_total_price) {
      this.wsp_total_price = wsp_total_price;
   }

   public Double getWsp_volume() {
      return wsp_volume;
   }

   public void setWsp_volume(Double wsp_volume) {
      this.wsp_volume = wsp_volume;
   }

   @Override
   public String toString() {
      return "WholesaleOrderProduct{" +
              "wsp_order_number='" + wsp_order_number + '\'' +
              ", wsp_product_id=" + wsp_product_id +
              ", wsp_product_qty=" + wsp_product_qty +
              ", wsp_invoice_price=" + wsp_invoice_price +
              ", wsp_total_price=" + wsp_total_price +
              ", wsp_volume=" + wsp_volume +
              '}';
   }
}
