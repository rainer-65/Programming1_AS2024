package lecture13.exercises;

// Define superclass Shape
public abstract class Shape implements Cloneable {
	// Shape color
	private String color;

	// Constructor
	public Shape(String color) {
		this.color = color;
	}

	// getter-Method for color
	public String getColor() {
		return color;
	}

	// setter-Method for color
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Shape of color=\"" + color + "\"";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	// All concrete shapes must have methods for computing the area and the circumference
	public abstract double getArea();
	public abstract double getCircumference();
}