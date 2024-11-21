package lecture03.examples;

public class EmployeeTest {

    public static void main(String[] args) {


        Employee e1 = new Employee("John Smith",
                12345,
                "012 111 11 11", "10.12.2001");

        Employee e2 = new Employee("Dessy Scott",
                56789,
                "012 222 22 22", "19.06.2001");

        Employee e3 = new Employee("Chris", 11111);

        System.out.println(e1.getName() + " " + e1.getEmployeeNumber());
        System.out.println(e2.getName() + " " + e2.getEmployeeNumber());
        System.out.println(e3.getName() + " " + e3.getEmployeeNumber());


        if(e3.getPhoneNumber() != null) {
            System.out.println(e3.getPhoneNumber());
        }
        else{
            System.out.println("No phone number given");
        }




    }
}
