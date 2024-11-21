package lecture09.examples.planets;

import java.util.Scanner;

public class YourWeightOnPlanet {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your weight on earth: ");
		double earthWeight = in.nextDouble();
		in.close();
		
		double mass = earthWeight / Planet.EARTH.surfaceGravity();
		for (Planet p : Planet.values()) {
			System.out.printf("Your weight on %s is %f%n", p, mass * p.surfaceGravity());
		}
	}
}
