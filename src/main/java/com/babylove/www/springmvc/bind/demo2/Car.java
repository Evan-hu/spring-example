package com.babylove.www.springmvc.bind.demo2;

/**
 * Created by Will.Zhang on 2016/11/18 0018 17:16.
 */
public class Car {

    private String name;
    private double price;
    private CarDetail carDetail;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public CarDetail getCarDetail() {
        return carDetail;
    }

    public void setCarDetail(CarDetail carDetail) {
        this.carDetail = carDetail;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", carDetail=" + carDetail +
                '}';
    }
}
