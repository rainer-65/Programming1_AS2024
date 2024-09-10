package lecture13.examples;

import java.util.ArrayList;

public class Star extends AstroBody {
	public static enum StarType {
		O, B, A, F, G, K, M
	};

	StarType starType;
	ArrayList<Planet> planets;

	public Star(String name) {
		super(name);
		planets = new ArrayList<Planet>();
	}

	public Star(String name, StarType starType) {
		super(name);
		this.starType = starType;
		planets = new ArrayList<Planet>();
	}

	@Override
	public double getSurfaceGravity() {
		return G * mass / (diameter * diameter / 4);
	}

	public StarType getStarType() {
		return starType;
	}

	public void setStarType(StarType starType) {
		this.starType = starType;
	}

	public void addPlanet(Planet p) {
		planets.add(p);
	}

	public ArrayList<Planet> getPlanets() {
		return planets;
	}
}
