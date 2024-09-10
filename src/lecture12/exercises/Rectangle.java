package lecture12.exercises;

//Define Rectangle, subclass of Shape
public class Rectangle extends Shape {
	// Private member variables
	private int length;
	private int width;

	// Constructor
	public Rectangle(String color, int length, int width) {
		super(color);
		this.length = length;
		this.width = width;
	}

	// getter and setter-Methods
	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	
	@Override
	public String toString() {
		return "Rectangle of length=" + length + " and width=" + width + ", subclass of " + super.toString();
	}
	

	@Override
	public double getArea() {
		return length * width;
	}

	@Override
	public double getCircumference() {
		return 2 * length + 2 * width;
	}

	// Overriding equals
	// Test whether the rectangles have identical values
	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		if (o == this)
			return true;
		if (!o.getClass().equals(this.getClass()))
		      return false;
		Rectangle otherRectangle = (Rectangle) o;
		return this.getColor().equals(otherRectangle.getColor()) && this.length == otherRectangle.length
				&& this.width == otherRectangle.width;
	}

}
