package com.ocp.cuit.pojo;

//产品表
public class Product {
    private Integer product_id;             //编号
    private String product_line;            //生产线名
    private String product_name;            //名称
    private Integer product_qty;            //数量
    private String unit_measurement_name;   //计量单位
    private String product_type;            //类型
    private String product_model;           //型号
    private Double product_standard_price;  //标准价格
    private Double product_volume;          //体积
    private Double product_weight;          //重量
    private Double product_length;          //长度
    private Double product_width;           //宽度
    private Double product_height;          //高度
    private Integer is_selling;             //是否正在销售


    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getProduct_line() {
        return product_line;
    }

    public void setProduct_line(String product_line) {
        this.product_line = product_line;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Integer getProduct_qty() {
        return product_qty;
    }

    public void setProduct_qty(Integer product_qty) {
        this.product_qty = product_qty;
    }

    public String getUnit_measurement_name() {
        return unit_measurement_name;
    }

    public void setUnit_measurement_name(String unit_measurement_name) {
        this.unit_measurement_name = unit_measurement_name;
    }

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    public String getProduct_model() {
        return product_model;
    }

    public void setProduct_model(String product_model) {
        this.product_model = product_model;
    }

    public Double getProduct_standard_price() {
        return product_standard_price;
    }

    public void setProduct_standard_price(Double product_standard_price) {
        this.product_standard_price = product_standard_price;
    }

    public Double getProduct_volume() {
        return product_volume;
    }

    public void setProduct_volume(Double product_volume) {
        this.product_volume = product_volume;
    }

    public Double getProduct_weight() {
        return product_weight;
    }

    public void setProduct_weight(Double product_weight) {
        this.product_weight = product_weight;
    }

    public Double getProduct_length() {
        return product_length;
    }

    public void setProduct_length(Double product_length) {
        this.product_length = product_length;
    }

    public Double getProduct_width() {
        return product_width;
    }

    public void setProduct_width(Double product_width) {
        this.product_width = product_width;
    }

    public Double getProduct_height() {
        return product_height;
    }

    public void setProduct_height(Double product_height) {
        this.product_height = product_height;
    }

    public Integer getIs_selling() {
        return is_selling;
    }

    public void setIs_selling(Integer is_selling) {
        this.is_selling = is_selling;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", product_line='" + product_line + '\'' +
                ", product_name='" + product_name + '\'' +
                ", product_qty=" + product_qty +
                ", unit_measurement_name='" + unit_measurement_name + '\'' +
                ", product_type='" + product_type + '\'' +
                ", product_model='" + product_model + '\'' +
                ", product_standard_price=" + product_standard_price +
                ", product_volume=" + product_volume +
                ", product_weight=" + product_weight +
                ", product_length=" + product_length +
                ", product_width=" + product_width +
                ", product_height=" + product_height +
                ", is_selling=" + is_selling +
                '}';
    }
}
