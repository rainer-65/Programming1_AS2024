package lecture12.exercises;

// Define Square, subclass of Rectangle
public class Square extends Rectangle {
	// Private member variable
	private int sideLength;

	// Constructor
	public Square(String color, int sideLength) {
		super(color, sideLength, sideLength);
		this.sideLength = sideLength;
	}

	// getter and setter-Methods
	public int getSideLength() {
		return sideLength;
	}

	public void setSideLength(int sideLength) {
		this.sideLength = sideLength;
	}

	@Override
	public String toString() {
		return "Square of side length=" + sideLength + ", subclass of " + super.toString();
	}

	@Override
	public double getArea() {
		return sideLength * sideLength;
	}

	@Override
	public double getCircumference() {
		return 4 * sideLength;
	}

}