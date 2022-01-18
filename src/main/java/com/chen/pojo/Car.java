package com.chen.pojo;

import java.math.BigDecimal;

public class Car {
    private String vin; //车架号码
    private String en;  //发动机号码
    private Model model; //型号
    private String color; //颜色
    private Integer isSell;  //是否卖出
    private String displacement; //排量
    private BigDecimal price; //售价
    private Depository depository; //存放仓库

    public Car() {
    }

    public Car(String vin, String en, Model model, String color, Integer isSell, String displacement, BigDecimal price, Depository depository) {
        this.vin = vin;
        this.en = en;
        this.model = model;
        this.color = color;
        this.isSell = isSell;
        this.displacement = displacement;
        this.price = price;
        this.depository = depository;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getIsSell() {
        return isSell;
    }

    public void setIsSell(Integer isSell) {
        this.isSell = isSell;
    }

    public String getDisplacement() {
        return displacement;
    }

    public void setDisplacement(String displacement) {
        this.displacement = displacement;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Depository getDepository() {
        return depository;
    }

    public void setDepository(Depository depository) {
        this.depository = depository;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vin='" + vin + '\'' +
                ", en='" + en + '\'' +
                ", model=" + model +
                ", color='" + color + '\'' +
                ", isSell=" + isSell +
                ", displacement='" + displacement + '\'' +
                ", price=" + price +
                ", depository=" + depository +
                '}';
    }
}
