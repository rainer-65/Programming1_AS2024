package lecture11.exercises;

public class VehicleCarMain {

    public static void main(String[] args) {

        // Object 1
        Car car1 = new Car(123, "VW", 2.5);
        System.out.println(car1);
        // Access to methods/attributes
        System.out.println(car1.getId());
        System.out.println(car1.getManufacturer());
        System.out.println(car1.getTrunkCapacity());
        System.out.println();

        // Object 2
        Vehicle veh1 = new Car(234, "VW", 2.5);
        System.out.println(veh1);
        // Access to methods/attributes
        System.out.println(veh1.getId());
        System.out.println(veh1.getManufacturer());
        System.out.println();

        // Object 3
        Vehicle veh2 = new Vehicle(456, "VW");
        System.out.println(veh2);
        System.out.println();

        // Object 4 - not allowed
        // Car car2 = new Vehicle(789, "VW");

    }

}
