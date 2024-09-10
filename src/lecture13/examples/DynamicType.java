package lecture13.examples;

class Super {
	Super() {

	}

	int print() {
		return 5;
	}
}

class Sub extends Super {
	Sub() {
	}

	int print() {
		return 3;
	}
}

public class DynamicType {

	public static void main(String[] args) {
		Super a = new Sub();
		System.out.println(a.print());
		Super b = new Super();
		a = b;
		System.out.println(a.print());
		System.out.println(b.print());
	}

}
