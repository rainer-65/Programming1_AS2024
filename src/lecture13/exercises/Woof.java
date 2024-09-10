package lecture13.exercises;

public class Woof {
	public static void main(String[] args) {
		C c = new D();
		c.f();
	}
}

class B {
	void f() {
		System.out.println("B::f");
		h();
	}

	void h() {
		System.out.println("B::h");
	}
}

class C extends B {
	void f() {
		System.out.println("C::f");
		g();
	}

	void g() {
		System.out.println("C::g");
		super.f();
	}
}

class D extends C {
	void f() {
		System.out.println("D::f");
		super.f();
	}

	void g() {
		System.out.println("D::g");
		super.g();
	}

	void h() {
		System.out.println("D::h");
	}
}