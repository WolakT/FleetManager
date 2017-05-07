package com.logistics.fleetmanagement;

public class Main {

    public static void main(String[] args) {
        Driver driver1 = new Driver("Jozek");
        Driver driver2 = new Driver ("Franek");
        Driver driver3 = new Driver ("Daniel");
        Driver driver4 = new Driver ("Antek");
        Vehicle veh = new Vehicle("test", "KR21435", 21002.3, driver4);
        Truck truck = new Truck("Volvo", "KRA893402", 120000.0, driver2);
        PassengerCar newCar = new PassengerCar("Toyota", "KR52362", 111354.4, driver3);
        Bus bus1 = new Bus("Scania", "KR23451", 24023.43, driver1);
        Manager manager = new Manager();
        manager.addVehicle(newCar);
        manager.addVehicle(truck);
        manager.addVehicle(bus1);
        System.out.println(manager.allVehicles.size());
        System.out.println(manager.getVehiclesDetails("KR52362"));
        manager.getPosition("Jozek");
    }
}
