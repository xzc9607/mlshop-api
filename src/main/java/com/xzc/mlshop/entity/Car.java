package com.xzc.mlshop.entity;

public class Car {
    private int id;
    private String brand;
    private String model;
    private String guideprice;
    private int price;
    private String filename;
    private String url;
    private String label;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getGuideprice() {
        return guideprice;
    }

    public void setGuideprice(String guideprice) {
        this.guideprice = guideprice;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", guideprice='" + guideprice + '\'' +
                ", price=" + price +
                ", filename='" + filename + '\'' +
                ", url='" + url + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}
