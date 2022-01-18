package com.chen.pojo;

public class Model {

    private String model;
    private String name;
    private String brand;
    private Integer sale;
    private Integer stock;

    public Model() {
    }

    public Model(String model, String name, String brand, Integer sale, Integer stock) {
        this.model = model;
        this.name = name;
        this.brand = brand;
        this.sale = sale;
        this.stock = stock;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getSale() {
        return sale;
    }

    public void setSale(Integer sale) {
        this.sale = sale;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Model{" +
                "model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", sale=" + sale +
                ", stock=" + stock +
                '}';
    }
}
