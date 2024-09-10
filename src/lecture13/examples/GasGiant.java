package lecture13.examples;

public class GasGiant extends Planet {
	double coreMass;
	double coreDiameter;

	public GasGiant(String name) {
		super(name);
	}

	@Override
	public double getSurfaceGravity() {
		return G * coreMass / (coreDiameter * coreDiameter / 4);
	}

	public void setCoreDiameter(double coreDiameter) {
		this.coreDiameter = coreDiameter;
	}

	public double getCoreDiameter() {
		return coreDiameter;
	}

	public void setCoreMass(double coreMass) {
		this.coreMass = coreMass;
	}

	public double getCoreMass() {
		return coreMass;
	}
}
