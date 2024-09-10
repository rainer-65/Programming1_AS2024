package lecture13.examples;

public class Employee implements Cloneable{
    
    private String name;
    
    private int salary;
    
    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    @Override
	protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
