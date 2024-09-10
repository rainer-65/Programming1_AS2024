package lecture10.examples;

// Java program to illustrate concept of Composition

// Importing required classes

import java.util.*;

// Class 1
// Company class
class Company {

    private String companyName;
    private List<Department> departments;

    // Constructor of Company class
    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    // Department is tightly connected to Company (Composition)
    static class Department {
        private String id;
        private String name;

        public Department(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public String toString() {
            return "Department: " + "ID = " + id + ", Name = " + name;
        }
    }

    // Method
    // to add new Department to the Company
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Getting all departments
    public List<Department> getDepartments() {
        return departments;
    }

}

// Class 3: Driver class
class CompanyDepartment {

    // Main driver method
    public static void main(String[] args) {
        // Creating a Company object
        Company heroCorp = new Company("Programming Hero Corp");

        // Adding Departments to the Company
        heroCorp.addDepartment(new Company.Department("A123", "Software Engineering"));
        heroCorp.addDepartment(new Company.Department("A135", "Human Resources"));
        heroCorp.addDepartment(new Company.Department("A187", "Research and Development"));
        heroCorp.addDepartment(new Company.Department("A546", "Marketing and Sales"));

        // Printing department details
        System.out.println("Department details of Hero Corp. ");
        System.out.println(heroCorp.getDepartments().toString());
    }
}
