package com.ocp.cuit.pojo;

public class Warehouse {
   private Integer warehouse_id;
   private String warehouse_name;
   private String warehouse_status;
   private String warehouse_contact_name;
   private String warehouse_contact_phone;
   private String warehouse_address;
   private String warehouse_remark;

   public Integer getWarehouse_id() {
      return warehouse_id;
   }

   public void setWarehouse_id(Integer warehouse_id) {
      this.warehouse_id = warehouse_id;
   }

   public String getWarehouse_name() {
      return warehouse_name;
   }

   public void setWarehouse_name(String warehouse_name) {
      this.warehouse_name = warehouse_name;
   }

   public String getWarehouse_status() {
      return warehouse_status;
   }

   public void setWarehouse_status(String warehouse_status) {
      this.warehouse_status = warehouse_status;
   }

   public String getWarehouse_contact_name() {
      return warehouse_contact_name;
   }

   public void setWarehouse_contact_name(String warehouse_contact_name) {
      this.warehouse_contact_name = warehouse_contact_name;
   }

   public String getWarehouse_contact_phone() {
      return warehouse_contact_phone;
   }

   public void setWarehouse_contact_phone(String warehouse_contact_phone) {
      this.warehouse_contact_phone = warehouse_contact_phone;
   }

   public String getWarehouse_address() {
      return warehouse_address;
   }

   public void setWarehouse_address(String warehouse_address) {
      this.warehouse_address = warehouse_address;
   }

   public String getWarehouse_remark() {
      return warehouse_remark;
   }

   public void setWarehouse_remark(String warehouse_remark) {
      this.warehouse_remark = warehouse_remark;
   }

   @Override
   public String toString() {
      return "Warehouse{" +
              "warehouse_id=" + warehouse_id +
              ", warehouse_name='" + warehouse_name + '\'' +
              ", warehouse_status='" + warehouse_status + '\'' +
              ", warehouse_contact_name='" + warehouse_contact_name + '\'' +
              ", warehouse_contact_phone='" + warehouse_contact_phone + '\'' +
              ", warehouse_address='" + warehouse_address + '\'' +
              ", warehouse_remark='" + warehouse_remark + '\'' +
              '}';
   }
}
