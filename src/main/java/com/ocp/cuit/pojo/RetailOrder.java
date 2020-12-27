package com.ocp.cuit.pojo;

import org.springframework.stereotype.Component;

import java.util.Date;

//零售订单
@Component
public class RetailOrder {
   private String rto_transaction_id;    //交易编号
   private Integer rto_retailer_id;       //所属经销商编号
   private String rto_source_website;     //来源网站
   private String rto_source_store;       //来源网店
   private String rto_order_status;       //订单状态
   private String rto_shipment_status;    //物流状态
   private Date rto_order_date;           //下单日期
   private Date rto_paid_date;            //付款日期
   private Date rto_shipment_date;        //发货日期
   private Double rto_order_price;        //订单价格
   private Double rto_actually_paid;      //实付金额
   private Double rto_weight;             //重量
   private Double rto_freight;            //运费
   private String rto_shipping_address;   //收货地址
   private String rto_receiver_name;      //收件人姓名
   private String rto_receiver_phone;     //收件人手机号
   private String rto_express_company;    //快递公司
   private Integer rto_express_number;    //快递单号

   public String getRto_transaction_id() {
      return rto_transaction_id;
   }

   public void setRto_transaction_id(String rto_transaction_id) {
      this.rto_transaction_id = rto_transaction_id;
   }

   public Integer getRto_retailer_id() {
      return rto_retailer_id;
   }

   public void setRto_retailer_id(Integer rto_retailer_id) {
      this.rto_retailer_id = rto_retailer_id;
   }

   public String getRto_source_website() {
      return rto_source_website;
   }

   public void setRto_source_website(String rto_source_website) {
      this.rto_source_website = rto_source_website;
   }

   public String getRto_source_store() {
      return rto_source_store;
   }

   public void setRto_source_store(String rto_source_store) {
      this.rto_source_store = rto_source_store;
   }

   public String getRto_order_status() {
      return rto_order_status;
   }

   public void setRto_order_status(String rto_order_status) {
      this.rto_order_status = rto_order_status;
   }

   public String getRto_shipment_status() {
      return rto_shipment_status;
   }

   public void setRto_shipment_status(String rto_shipment_status) {
      this.rto_shipment_status = rto_shipment_status;
   }

   public Date getRto_order_date() {
      return rto_order_date;
   }

   public void setRto_order_date(Date rto_order_date) {
      this.rto_order_date = rto_order_date;
   }

   public Date getRto_paid_date() {
      return rto_paid_date;
   }

   public void setRto_paid_date(Date rto_paid_date) {
      this.rto_paid_date = rto_paid_date;
   }

   public Date getRto_shipment_date() {
      return rto_shipment_date;
   }

   public void setRto_shipment_date(Date rto_shipment_date) {
      this.rto_shipment_date = rto_shipment_date;
   }

   public Double getRto_order_price() {
      return rto_order_price;
   }

   public void setRto_order_price(Double rto_order_price) {
      this.rto_order_price = rto_order_price;
   }

   public Double getRto_actually_paid() {
      return rto_actually_paid;
   }

   public void setRto_actually_paid(Double rto_actually_paid) {
      this.rto_actually_paid = rto_actually_paid;
   }

   public Double getRto_weight() {
      return rto_weight;
   }

   public void setRto_weight(Double rto_weight) {
      this.rto_weight = rto_weight;
   }

   public Double getRto_freight() {
      return rto_freight;
   }

   public void setRto_freight(Double rto_freight) {
      this.rto_freight = rto_freight;
   }

   public String getRto_shipping_address() {
      return rto_shipping_address;
   }

   public void setRto_shipping_address(String rto_shipping_address) {
      this.rto_shipping_address = rto_shipping_address;
   }

   public String getRto_receiver_name() {
      return rto_receiver_name;
   }

   public void setRto_receiver_name(String rto_receiver_name) {
      this.rto_receiver_name = rto_receiver_name;
   }

   public String getRto_receiver_phone() {
      return rto_receiver_phone;
   }

   public void setRto_receiver_phone(String rto_receiver_phone) {
      this.rto_receiver_phone = rto_receiver_phone;
   }

   public String getRto_express_company() {
      return rto_express_company;
   }

   public void setRto_express_company(String rto_express_company) {
      this.rto_express_company = rto_express_company;
   }

   public Integer getRto_express_number() {
      return rto_express_number;
   }

   public void setRto_express_number(Integer rto_express_number) {
      this.rto_express_number = rto_express_number;
   }

   @Override
   public String toString() {
      return "RetailOrder{" +
              "rto_transaction_id=" + rto_transaction_id +
              ", rto_retailer_id=" + rto_retailer_id +
              ", rto_source_website='" + rto_source_website + '\'' +
              ", rto_source_store='" + rto_source_store + '\'' +
              ", rto_order_status='" + rto_order_status + '\'' +
              ", rto_shipment_status='" + rto_shipment_status + '\'' +
              ", rto_order_date=" + rto_order_date +
              ", rto_paid_date=" + rto_paid_date +
              ", rto_shipment_date=" + rto_shipment_date +
              ", rto_order_price=" + rto_order_price +
              ", rto_actually_paid=" + rto_actually_paid +
              ", rto_weight=" + rto_weight +
              ", rto_freight=" + rto_freight +
              ", rto_shipping_address='" + rto_shipping_address + '\'' +
              ", rto_receiver_name='" + rto_receiver_name + '\'' +
              ", rto_receiver_phone='" + rto_receiver_phone + '\'' +
              ", rto_express_company='" + rto_express_company + '\'' +
              ", rto_express_number=" + rto_express_number +
              '}';
   }
}
