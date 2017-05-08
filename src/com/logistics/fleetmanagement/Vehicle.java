package com.logistics.fleetmanagement;

/**
 * Created by Tomcio on 2017-05-07.
 */
public class Vehicle {
    private String brand;
    private String registrationNo;
    private Double mileage;
    private Driver driver;

    private Double latitude;
    private Double longitude;

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Vehicle(String brand, String registrationNo, Double mileage) {
        this.brand = brand;
        this.registrationNo = registrationNo;
        this.mileage = mileage;
        this.driver = driver;
        this.latitude = 50.03;
        this.longitude = 19.56;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public Double getMileage() {
        return mileage;
    }

    public void setMileage(Double mileage) {
        this.mileage = mileage;
    }

    public String getDriver() {
        return driver.getName();
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

}
