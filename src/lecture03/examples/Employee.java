package lecture03.examples;

public class Employee {
    private String name;
    private int employeeNumber;
    private String phoneNumber;
    private String birthDate;

    public Employee(String name, int employeeNumber){
        this.name = name;
        this.employeeNumber = employeeNumber;
    }

    public Employee(String name, int employeeNumber,
                    String phoneNumber, String birthDate){
        this.name = name;
        this.employeeNumber = employeeNumber;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }
}
