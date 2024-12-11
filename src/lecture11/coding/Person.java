package lecture11.coding;

public class Person {

    final int id;
    String name;
    int age;

    public Person(String name, int age) {
        this.id = getNextID();
        this.name = name;
        this.age = age;

    }

    static int nextId;

    protected int getNextID() {
        return nextId++;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
