package lecture12.exercises;

public class Circle extends Shape {

	private int radius;

	public Circle(String color, int r) {
		super(color);
		radius = r;
	}

	// getter and setter-Methods
	public int getRadius() {
		return radius;
	}

	public void setRadius(int r) {
		r = radius;
	}

	@Override
	public String toString() {
		return "Circle of radius=" + radius + ", subclass of " + super.toString();
	}

	@Override
	public double getArea() {
		double temp = Math.PI * Math.pow(radius, 2);
		return Math.round(100.0 * temp) / 100.0; // Rounding for two decimal places

	}

	@Override
	public double getCircumference() {
		double temp = 2 * radius * Math.PI;
		return Math.round(100.0 * temp) / 100.0; // Rounding for two decimal places
	}

}
