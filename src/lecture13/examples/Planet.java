package lecture13.examples;

import java.util.ArrayList;

public class Planet extends AstroBody {
	public static enum Gas {
		HYDROGEN, HELIUM, OXYGEN, NITROGEN, METHANE
	};

	ArrayList<Planet> moons;
	ArrayList<Gas> atmosphericGases;

	public Planet(String name) {
		super(name);
		atmosphericGases = new ArrayList<Gas>();
	}

	/**
	 * Calculate surface gravity from mass and diameter
	 */
	@Override
	public double getSurfaceGravity() {
		return G * mass / (diameter * diameter / 4);
	}

	public void addMoon(Planet p) {
		moons.add(p);
	}

	public ArrayList<Planet> getMoons() {
		return moons;
	}

	public void addAtmospericGas(Gas g) {
		atmosphericGases.add(g);
	}

	public ArrayList<Gas> getAtmosphericGases() {
		return atmosphericGases;
	}
}
