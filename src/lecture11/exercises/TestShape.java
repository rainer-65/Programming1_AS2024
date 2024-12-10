package lecture11.exercises;

//	A test driver program for Shape and its subclasses

public class TestShape {
	public static void main(String[] args) {

		// Create some Objects
		Rectangle s1 = new Rectangle("red", 4, 5);
		System.out.println(s1.toString());
		System.out.println("Area is " + s1.getArea());
		System.out.println("Circumference is " + s1.getCircumference());
		System.out.println();

		Triangle s2 = new Triangle("blue", 4, 5, 2, 2);
		System.out.println(s2.toString());
		System.out.println("Area is " + s2.getArea());
		System.out.println("Circumference is " + s2.getCircumference());
		System.out.println();

		Circle s3 = new Circle("green", 7);
		System.out.println(s3.toString());
		System.out.println("Area is " + s3.getArea());
		System.out.println("Circumference is " + s3.getCircumference());
		System.out.println();

		Square s4 = new Square("yellow", 12);
		System.out.println(s4.toString());
		System.out.println("Area is " + s4.getArea());
		System.out.println("Circumference is " + s4.getCircumference());
		System.out.println();

		Rectangle s5 = new Rectangle("red", 4, 5);
		System.out.println(s5.toString());
		System.out.println("Area is " + s5.getArea());
		System.out.println("Circumference is " + s5.getCircumference());
		System.out.println();

		Rectangle s6 = new Rectangle("amber", 8, 5);
		System.out.println(s6.toString());
		System.out.println("Area is " + s6.getArea());
		System.out.println("Circumference is " + s6.getCircumference());
		System.out.println();
	
		// Test if Rectangles have identical values (i.e. color / length / width)
		System.out.println("Do the Rectangle s1 and Rectangle s5 have the same values? " + s1.equals(s5));
		System.out.println("Do the Rectangle s5 and Rectangle s6 have the same values? " + s5.equals(s6));
	}
}
