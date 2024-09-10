package lecture12.exercises;

class Super {
	String s;

	public Super() {

	}

	public Super(String s) {
		this.s = s;
	}

}

public class Sub extends Super {
	int x = 200;

	public Sub(String s) {
	}

	public Sub() {
		System.out.println("Sub");
	}

	public static void main(String[] args) {
		Sub s = new Sub();

	}

}
