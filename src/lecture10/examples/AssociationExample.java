package lecture10.examples;

import java.util.*;

// Java Program to illustrate the concept of Association using a List

// Class 1
// Bank class
class Bank {

    // Attributes of bank
    private String bankName;
    private List<Employee> employees;

    // Constructor of Bank class
    public Bank(String bankName) {
        this.bankName = bankName;
    }

    // Method of Bank class
    public String getBankName() {
        // Returning name of bank
        return this.bankName;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return this.employees;
    }
}

// Class 2
// Employee class
class Employee {

    // Attributes of employee
    private String name;

    // Constructor of Employee class
    public Employee(String name) {
        // this keyword refers to current instance
        this.name = name;
    }

    // Method of Employee class
    public String getEmployeeName() {
        // returning the name of employee
        return this.name;
    }
}

// Class 3: Driver class
// Association between both the classes in main method
class BankEmployee {

    // Main driver method
    public static void main(String[] args) {
        // Creating Employee objects
        Employee emp1 = new Employee("John Miller");
        Employee emp2 = new Employee("David Peterson");

        // adding the employees to a list
        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);

        // Creating a Bank object
        Bank bank = new Bank("HSBC Bank");

        // Setting the employees for the Bank object
        bank.setEmployees(employees);

        // Traversing and displaying the bank employees
        for (Employee emp : bank.getEmployees()) {
            System.out.println(emp.getEmployeeName()
                    + " belongs to bank "
                    + bank.getBankName());
        }
    }
}
