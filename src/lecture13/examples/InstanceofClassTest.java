package lecture13.examples;

class Base {
}

class Derived extends Base {
}

public class InstanceofClassTest {

	static void test(Object x) {
		System.out.println("Testing x of type " + x.getClass().getSimpleName());
		System.out.println("x instanceof Base " + (x instanceof Base));
		System.out.println("x instanceof Derived " + (x instanceof Derived));
	}

	public static void main(String[] args) {
		test(new Base());
		test(new Derived());

	}
}
