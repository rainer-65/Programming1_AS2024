package lecture11.examples;

class Beast {

    public void move() {
        System.out.println("Beasts can move");
    }
}

class Bear extends Beast {


    public void move() {
        super.move(); // invokes the super class method
        System.out.println("Bears can walk and run");
    }

}

public class BearTest {

    public static void main(String args[]) {

        Beast b = new Bear(); // Beast reference but Bear object
        b.move(); // Runs the method in the Bear class

    }
}
