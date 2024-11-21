package lecture03.exercises;


public class CarTest {

    public static void main(String[] args) {
        Car c1 = new Car("Ford", "Taurus", 2007);
        Car c2 = new Car("Honda", "Odyssey", 2011);
        Car c3 = new Car("Toyota", "Corolla", 1999);
        Car c4 = new Car("Ford", "Mustang", 1966);

        System.out.println(c1.getMake() + " " + c1.getModel() + " " + c1.getYear());
        System.out.println(c2.getMake() + " " + c2.getModel() + " " + c2.getYear());
        System.out.println(c3.getMake() + " " + c3.getModel() + " " + c3.getYear());
        System.out.println(c4.getMake() + " " + c4.getModel() + " " + c4.getYear());

        c1.setModel("Explorer");
        c2.setYear(2010);
        c3.setMake("Nissan");
        c3.setModel("Maxima");

        System.out.println(c1.getMake() + " " + c1.getModel() + " " + c1.getYear());
        System.out.println(c2.getMake() + " " + c2.getModel() + " " + c2.getYear());
        System.out.println(c3.getMake() + " " + c3.getModel() + " " + c3.getYear());

        System.out.println("Toyota antik?: " + c3.isAntique());
        System.out.println("Ford antik?: " + c4.isAntique());
    }
}
