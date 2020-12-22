package com.ocp.cuit.pojo;

//经销商信息
public class Retailer {
   private int retailer_id;               //编号
   private String retailer_name;          //名称
   private String retailer_shortname;     //简称
   private String retailer_area;          //区域
   private String retailer_store_name;    //店名
   private String retailer_institute;     //机构
   private String retailer_type;          //类型
   private String retailer_user_name;     //用户名
   private String retailer_contact_name;  //联系人名
   private String retailer_email;         //邮箱
   private String retailer_phone;         //手机
   private String retailer_status;        //帐号状态
   private String retailer_remark;        //备注


   public int getRetailer_id() {
      return retailer_id;
   }

   public void setRetailer_id(int retailer_id) {
      this.retailer_id = retailer_id;
   }

   public String getRetailer_name() {
      return retailer_name;
   }

   public void setRetailer_name(String retailer_name) {
      this.retailer_name = retailer_name;
   }

   public String getRetailer_shortname() {
      return retailer_shortname;
   }

   public void setRetailer_shortname(String retailer_shortname) {
      this.retailer_shortname = retailer_shortname;
   }

   public String getRetailer_area() {
      return retailer_area;
   }

   public void setRetailer_area(String retailer_area) {
      this.retailer_area = retailer_area;
   }

   public String getRetailer_store_name() {
      return retailer_store_name;
   }

   public void setRetailer_store_name(String retailer_store_name) {
      this.retailer_store_name = retailer_store_name;
   }

   public String getRetailer_institute() {
      return retailer_institute;
   }

   public void setRetailer_institute(String retailer_institute) {
      this.retailer_institute = retailer_institute;
   }

   public String getRetailer_type() {
      return retailer_type;
   }

   public void setRetailer_type(String retailer_type) {
      this.retailer_type = retailer_type;
   }

   public String getRetailer_user_name() {
      return retailer_user_name;
   }

   public void setRetailer_user_name(String retailer_user_name) {
      this.retailer_user_name = retailer_user_name;
   }

   public String getRetailer_contact_name() {
      return retailer_contact_name;
   }

   public void setRetailer_contact_name(String retailer_contact_name) {
      this.retailer_contact_name = retailer_contact_name;
   }

   public String getRetailer_email() {
      return retailer_email;
   }

   public void setRetailer_email(String retailer_email) {
      this.retailer_email = retailer_email;
   }

   public String getRetailer_phone() {
      return retailer_phone;
   }

   public void setRetailer_phone(String retailer_phone) {
      this.retailer_phone = retailer_phone;
   }

   public String getRetailer_status() {
      return retailer_status;
   }

   public void setRetailer_status(String retailer_status) {
      this.retailer_status = retailer_status;
   }

   public String getRetailer_remark() {
      return retailer_remark;
   }

   public void setRetailer_remark(String retailer_remark) {
      this.retailer_remark = retailer_remark;
   }

   @Override
   public String toString() {
      return "Retailer{" +
              "retailer_id=" + retailer_id +
              ", retailer_name='" + retailer_name + '\'' +
              ", retailer_shortname='" + retailer_shortname + '\'' +
              ", retailer_area='" + retailer_area + '\'' +
              ", retailer_store_name='" + retailer_store_name + '\'' +
              ", retailer_institute='" + retailer_institute + '\'' +
              ", retailer_type='" + retailer_type + '\'' +
              ", retailer_user_name='" + retailer_user_name + '\'' +
              ", retailer_contact_name='" + retailer_contact_name + '\'' +
              ", retailer_email='" + retailer_email + '\'' +
              ", retailer_phone='" + retailer_phone + '\'' +
              ", retailer_status='" + retailer_status + '\'' +
              ", retailer_remark='" + retailer_remark + '\'' +
              '}';
   }
}
