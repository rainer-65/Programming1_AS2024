package lecture11.coding;

public class Customer extends Person{

    String status;

    public Customer(String name, int age, String status) {
        super(name, age);
        this.status = status;
    }

    static int nextId;

    protected int getNextID() {
        return nextId++;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "status='" + status + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}