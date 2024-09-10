package lecture13.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//	A test driver program for Shape and its subclasses

public class TestShape {
	public static void main(String[] args) {

		// Create empty ArrayList for Rectangles
		ArrayList<Rectangle> rectList = new ArrayList<Rectangle>();

		// Create some Rectangles
		Rectangle s1 = new Rectangle("yellow", 4, 5);
		System.out.println(s1.toString());
		System.out.println("Area is " + s1.getArea());
		System.out.println("Circumference is " + s1.getCircumference());
		System.out.println();

		Rectangle s2 = new Rectangle("red", 4, 5);
		System.out.println(s2.toString());
		System.out.println("Area is " + s2.getArea());
		System.out.println("Circumference is " + s2.getCircumference());
		System.out.println();

		Rectangle s3 = new Rectangle("amber", 4, 7);
		System.out.println(s3.toString());
		System.out.println("Area is " + s3.getArea());
		System.out.println("Circumference is " + s3.getCircumference());
		System.out.println();

		// Add Rectangles to ArrayList
		rectList.add(s1);
		rectList.add(s2);
		rectList.add(s3);

		// Sort ArrayList of Rectangles
		Collections.sort(rectList);

		// Print Sorted ArrayList of Rectangles
		System.out.println("Sorted List of Rectangles (by Area Size):");
		Iterator<Rectangle> itr = rectList.iterator();
		while (itr.hasNext()) {
			Rectangle rect = itr.next();
			System.out.println(rect.toString() + " Area Size: " + rect.getArea());
		}
		System.out.println();

		// Clone a rectangle and test if it has the type rectangle
		Rectangle s4 = null;
		try {
			s4 = (Rectangle) s3.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		// Print Details of clones rectangles
		System.out.println("Print infos of cloned rectangle");
		System.out.println(s3.toString());
		System.out.println(s4.toString());

		// Test Cloning
		// s4.setColor("black");
		// System.out.println(s3.toString());
		// System.out.println(s4.toString());

		// Test for the type "Rectangle"
		System.out.println("");
		if (s4 instanceof Rectangle) {
			System.out.println("Object s4 has type Rectangle");
		}
	}
}
