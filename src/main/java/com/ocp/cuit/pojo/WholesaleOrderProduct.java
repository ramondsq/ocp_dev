package com.ocp.cuit.pojo;

//批发订单-产品映射
public class WholesaleOrderProduct {
   private String wsop_order_id;    //订单编号
   private Integer wsop_product_id;     //产品编号
   private Double wsop_product_qty;     //数量
   private Double wsop_invoice_price;   //开票价格
   private Double wsop_total_price;     //总金额
   private Double wsop_volume;          //总体积

   public String getWsop_order_id() {
      return wsop_order_id;
   }

   public void setWsop_order_id(String wsop_order_id) {
      this.wsop_order_id = wsop_order_id;
   }

   public Integer getWsop_product_id() {
      return wsop_product_id;
   }

   public void setWsop_product_id(Integer wsop_product_id) {
      this.wsop_product_id = wsop_product_id;
   }

   public Double getWsop_product_qty() {
      return wsop_product_qty;
   }

   public void setWsop_product_qty(Double wsop_product_qty) {
      this.wsop_product_qty = wsop_product_qty;
   }

   public Double getWsop_invoice_price() {
      return wsop_invoice_price;
   }

   public void setWsop_invoice_price(Double wsop_invoice_price) {
      this.wsop_invoice_price = wsop_invoice_price;
   }

   public Double getWsop_total_price() {
      return wsop_total_price;
   }

   public void setWsop_total_price(Double wsop_total_price) {
      this.wsop_total_price = wsop_total_price;
   }

   public Double getWsop_volume() {
      return wsop_volume;
   }

   public void setWsop_volume(Double wsop_volume) {
      this.wsop_volume = wsop_volume;
   }

   @Override
   public String toString() {
      return "WholesaleOrderProduct{" +
              "wsop_order_id='" + wsop_order_id + '\'' +
              ", wsop_product_id=" + wsop_product_id +
              ", wsop_product_qty=" + wsop_product_qty +
              ", wsop_invoice_price=" + wsop_invoice_price +
              ", wsop_total_price=" + wsop_total_price +
              ", wsop_volume=" + wsop_volume +
              '}';
   }
}
