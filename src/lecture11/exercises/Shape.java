package lecture11.exercises;

// Define superclass Shape
public class Shape {
	// Private member variable
	private String color;

	// Constructor
	public Shape(String color) {
		this.color = color;
	}

	// getter-Method for color
	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Shape of color=\"" + color + "\"";
	}

	// All shapes must have a method called getArea()
	public double getArea() {
		System.err.println("Shape unknown! Cannot compute area!");
		return 0; // Need a return to compile the program
	}

	// All shapes must have a method called getCircumference()
	public double getCircumference() {
		System.err.println("Shape unknown! Cannot compute circumference!");
		return 0; // Need a return to compile the program
	}
}