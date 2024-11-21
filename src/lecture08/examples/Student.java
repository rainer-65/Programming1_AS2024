package lecture08.examples;

public class Student implements Comparable<Student> {
    private int id;
    private String lastName;
    private String firstName;
    private double gpa;

    // Constructor
    public Student(int id, String lastName, String firstName, double gpa) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.gpa = gpa;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public double getGpa() {
        return gpa;
    }

    // toString method for displaying student information
    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", lastName='" + lastName + '\'' + ", firstName='" + firstName + '\'' + ", gpa=" + gpa + '}';
    }

    // Implementing the compareTo method for GPA, last name, and first name
    @Override
    public int compareTo(Student other) {
        // Compare by GPA in descending order
        if (Double.compare(other.gpa, this.gpa) != 0) {
            return Double.compare(other.gpa, this.gpa);
        }

        // If GPA is the same, compare by last name (in ascending order)
        int lastNameComparison = this.lastName.compareTo(other.lastName);
        if (lastNameComparison != 0) {
            return lastNameComparison;
        }

        // If last name is also the same, compare by first name (in ascending order)
        return this.firstName.compareTo(other.firstName);
    }

}