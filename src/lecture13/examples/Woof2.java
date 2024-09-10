package lecture13.examples;

public class Woof2 {
	public static void main(String[] args) {
		// Calling the static methods by ClassName.staticMethodName
		System.out.println(B.number());
		System.out.println(C.number());

	}
}

class B {
	static int number() {
		return 5;
	}
}

class C extends B {
	static int number() {
		return 3;
	}
}
