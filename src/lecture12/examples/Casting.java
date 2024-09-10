package lecture12.examples;

class MySuperclass {
	int a = 1;

	int giveValue() {
		return this.a;
	}
}

class MySubclass extends MySuperclass {
	int b = 5;

	int giveValue() {
		return this.b;
	}
}

public class Casting {

	public static void main(String[] args) {
		MySuperclass object1 = new MySubclass(); // Implicit Casting
		System.out.println(object1.giveValue());
		System.out.println(object1.a);
		// System.out.println(object1.b);
		System.out.println();

		MySuperclass object2 = object1;			// Implicit Casting
		System.out.println(object2.giveValue()); 
		System.out.println(object2.a);
		// System.out.println(object2.b);
		System.out.println();

		MySubclass object3 = (MySubclass) object1; // Downcasting (explicit
													// Casting)
		System.out.println(object3.giveValue());
		System.out.println(object3.a);
		System.out.println(object3.b);
		System.out.println();

		MySuperclass object4 = new MySuperclass();
		MySubclass object5 = (MySubclass) object4; // Error: ClassCastException

	}

}
