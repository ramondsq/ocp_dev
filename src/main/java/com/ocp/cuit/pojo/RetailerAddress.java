package com.ocp.cuit.pojo;

//经销商地址信息
public class RetailerAddress {
    private Integer rta_retailer_id;        //编号
    private String rta_address;             //地址
    private String rta_receiver_name;       //收件人姓名
    private String rta_phone;               //手机号

    public Integer getRta_retailer_id() {
        return rta_retailer_id;
    }

    public void setRta_retailer_id(Integer rta_retailer_id) {
        this.rta_retailer_id = rta_retailer_id;
    }

    public String getRta_address() {
        return rta_address;
    }

    public void setRta_address(String rta_address) {
        this.rta_address = rta_address;
    }

    public String getRta_receiver_name() {
        return rta_receiver_name;
    }

    public void setRta_receiver_name(String rta_receiver_name) {
        this.rta_receiver_name = rta_receiver_name;
    }

    public String getRta_phone() {
        return rta_phone;
    }

    public void setRta_phone(String rta_phone) {
        this.rta_phone = rta_phone;
    }
}
