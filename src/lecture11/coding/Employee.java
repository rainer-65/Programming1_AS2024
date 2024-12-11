package lecture11.coding;

public class Employee extends Person {

    private double salary;

    public Employee(int id, String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    static int nextId;

    protected int getNextID() {
        return nextId++;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}




