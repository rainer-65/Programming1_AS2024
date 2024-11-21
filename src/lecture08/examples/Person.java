package lecture08.examples;

public class Person implements Comparable<Person> {
    private static int nextID = 0;

    public Person(int id) {
        this.id = id;
    }

    public enum Gender {male, female}

    ;

    private final int id; // ID unchangeable after being set
    private String lastName;
    private String firstName;


    @Override                                           // Replace existing implementation
    public boolean equals(Object obj) {                 // Parameter can be any object
        boolean result = false;                         // Let's be pessimists
        if (obj != null) {                              // If parameter is not null
            if (this.getClass() == obj.getClass()) {    // If parameter is our class
                Person other = (Person) obj;            // Cast parameter to our class
                result = (this.id == other.id);         // Compare the ID values
            }
        }

        return result;

    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.id, other.id);
        // Alternative: return this.id - other.id;

    }


}
