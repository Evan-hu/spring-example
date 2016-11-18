package com.babylove.www.springmvc.bind.demo2;

/**
 * Created by Will.Zhang on 2016/11/18 0018 17:17.
 */
public class CarDetail {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "CarDetail{" +
                "description='" + description + '\'' +
                '}';
    }
}
