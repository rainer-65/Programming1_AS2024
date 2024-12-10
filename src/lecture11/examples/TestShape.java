package lecture11.examples;

// A test driver program for Shape and its subclasses
public class TestShape {
	public static void main(String[] args) {
		Rectangle s1 = new Rectangle("red", 4, 5);
		System.out.println(s1.toString());
		System.out.println("Area is " + s1.getArea());

		Triangle s2 = new Triangle("blue", 4, 5);
		System.out.println(s2.toString());
		System.out.println("Area is " + s2.getArea());
	}
}
