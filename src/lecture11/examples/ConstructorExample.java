package lecture11.examples;

class Parentclass {
	int num;
	static final double pi = 3.14159265;

	Parentclass() {
		System.out.println("Hello, I am the Superclass constructor Nr. 1!");
	}
	
	Parentclass(int num) {
		System.out.println("Hello, I am the Superclass constructor Nr. 2!");
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
}

class Childclass extends Parentclass {

	int num = 110;

	Childclass() {
		super(100);
		System.out.println("Hello, I am the Subclass constructor!");
	}
	
	public int getNum() {
		return num;
	}

	void printNumber() {
		System.out.println(num);
		System.out.println(super.num);
		System.out.println(getNum());
		System.out.println(super.getNum());
		System.out.println(Parentclass.pi);
		System.out.println(pi);

	}
}

public class ConstructorExample {
	public static void main(String args[]) {
		Childclass obj = new Childclass();
		obj.printNumber();

	}
}
