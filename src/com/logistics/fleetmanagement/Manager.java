package com.logistics.fleetmanagement;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tomcio on 2017-05-07.
 */
public class Manager {
    List<Vehicle> allVehicles = new ArrayList<>();

    public Manager() {

    }

    public Manager(List<Vehicle> allVehicles) {
        this.allVehicles = allVehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        allVehicles.add(vehicle);
    }
    public void removeVehicle (Vehicle vehicle){
        allVehicles.remove(vehicle);
    }
    public String getVehiclesDetails(String registrationNo){
        for (Vehicle vehicle:allVehicles) {
            if(vehicle.getRegistrationNo().equals(registrationNo)){
                return vehicle.getBrand() + " " + vehicle.getRegistrationNo() + " " + vehicle.getMileage();
            }
        }
        return "No such vehicle in database";
    }
    public int getTotalVehicleNumber(){
        return allVehicles.size();
    }
    public void getPosition(String name){
        for (Vehicle vehicle : allVehicles) {
            if (vehicle.getDriver().equals(name)){
                System.out.println(vehicle.getLatitude()+ " " + vehicle.getLongitude());
            };
        }

    }
}
