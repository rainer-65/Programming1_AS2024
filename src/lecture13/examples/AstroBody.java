package lecture13.examples;

public abstract class AstroBody implements Comparable<AstroBody> {
	public static final double G = 6.67428E-11; // Gravitational constant
	String name; // Catalog number or unique name
	double diameter; // in meters
	double mass; // in kg
	AstroBody orbiting; // what object this object orbits (null for stars)

	public AstroBody(String name) {
		this.name = name;
		diameter = 0;
		mass = 0;
		orbiting = null;
	}

	public abstract double getSurfaceGravity();

	@Override
	public int compareTo(AstroBody o) {
		if (this.getMass() < o.getMass()) {
			return -1;
		} else if (this.getMass() > o.getMass()) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AstroBody other = (AstroBody) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String toString() {
		return this.name;
	}

	public String getName() {
		return name;
	}

	// other getters and setters...
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	public double getMass() {
		return mass;
	}

	public final void setOrbiting(AstroBody orbiting) {
		this.orbiting = orbiting;
	}

	public final AstroBody getOrbiting() {
		return orbiting;
	}
}
