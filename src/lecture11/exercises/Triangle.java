package lecture11.exercises;

//Define Triangle, subclass of Shape
public class Triangle extends Shape {
	// Private member variables
	private int base;
	private int length_a;
	private int length_c;
	private int height;

	// Constructor
	public Triangle(String color, int base, int height, int length_a, int length_c) {
		super(color);
		this.base = base;
		this.height = height;
		this.length_a = length_a;
		this.length_c = length_c;
	}

	// getter and setter-Methods
	public int getBase() {
		return base;
	}

	public int getLength_a() {
		return length_a;
	}

	public int getLength_c() {
		return length_c;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public void setLength_a(int length_a) {
		this.length_a = length_a;
	}

	public void setLength_c(int length_c) {
		this.length_c = length_c;
	}

	@Override
	public String toString() {
		return "Triangle of base=" + base + " and height=" + height + ", subclass of " + super.toString();
	}

	@Override
	public double getArea() {
		return 0.5 * base * height;
	}

	@Override
	public double getCircumference() {
		return base + length_a + length_c;
	}
}
