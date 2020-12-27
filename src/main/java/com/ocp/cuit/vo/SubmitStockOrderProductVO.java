package com.ocp.cuit.vo;

import org.springframework.stereotype.Component;

@Component
public class SubmitStockOrderProductVO {
    private Integer product_id;     //产品编码
    private Double product_qty;     //产品数量
    private Double invoice_price;   //开票价格
    private Double total_price;     //总价
    private Double volume;          //体积

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public Double getProduct_qty() {
        return product_qty;
    }

    public void setProduct_qty(Double product_qty) {
        this.product_qty = product_qty;
    }

    public Double getInvoice_price() {
        return invoice_price;
    }

    public void setInvoice_price(Double invoice_price) {
        this.invoice_price = invoice_price;
    }

    public Double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(Double total_price) {
        this.total_price = total_price;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "SubmitStockOrderProductVO{" +
                "product_id=" + product_id +
                ", product_qty=" + product_qty +
                ", invoice_price=" + invoice_price +
                ", total_price=" + total_price +
                ", volume=" + volume +
                '}';
    }
}
