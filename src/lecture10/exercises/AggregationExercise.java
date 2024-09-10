package lecture10.exercises;

// Importing required classes

import java.util.*;

// Class 1
// Car class
class Car {

    // Attributes of Car
    private String manufacturerCar;
    private String type;
    private String serialNumber;
    private Wheel wheel;

    // Constructor of Car class
    public Car(String manufacturerCar, String type, String serialNumber, Wheel wheel) {
        this.manufacturerCar = manufacturerCar;
        this.type = type;
        this.serialNumber = serialNumber;
        this.wheel = wheel;
    }

    public String getManufacturerCar() {
        return manufacturerCar;
    }

    public String getType() {
        return type;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String toString() {
        return "Car Manufacturer: " + this.manufacturerCar + " " + "Type: " + this.type + " " + "Serial Number: " + this.serialNumber;
    }

    public String getWheelInfo() {
        return "Wheel Manufacturer: " + wheel.getManufacturerWheel() + " " + "Tire dimension: " + wheel.getTireDimension();
    }
}

// Class 2
// Wheel class
class Wheel {

    // Attributes of Wheel class
    private String manufacturerWheel;
    private String tireDimension;

    // Constructor of Wheel class
    public Wheel(String manufacturerWheel, String tireDimension) {
        this.manufacturerWheel = manufacturerWheel;
        this.tireDimension = tireDimension;
    }

    public String getManufacturerWheel() {
        return manufacturerWheel;
    }

    public String getTireDimension() {
        return tireDimension;
    }

    public String toString() {
        return "Tire Manufacturer: " + this.manufacturerWheel + " " + "Tire Dimension: " + this.tireDimension;
    }
}

// Class 3
// Driver class
class CarWheel {

    // main driver method
    public static void main(String[] args) {

        // Creating Wheel objects
        Wheel conti1 = new Wheel("Continental", "175/60 R15 81H");
        Wheel conti2 = new Wheel("Continental", "195/65 R15 91H");
        Wheel michelin1 = new Wheel("Michelin", "185/65 R15 88T");
        Wheel michelin2 = new Wheel("Michelin", "175/65 R14 82T");
        Wheel michelin3 = new Wheel("Michelin", "195/65 R15 91H");

        // Creating Car objects
        Car audi1 = new Car("Audi", "A5", "A12345", conti2);
        Car audi2 = new Car("Audi", "A5", "A66534", michelin3);

        // Display Car and Wheel information
        System.out.println(audi1.toString() + " " + audi1.getWheelInfo());
        System.out.println(audi2.toString() + " " + audi2.getWheelInfo());


    }

}


