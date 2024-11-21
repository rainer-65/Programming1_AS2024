package lecture09.examples.planets;

public enum Planet {
	MERCURY(3.3011e+23, 2.4397e6),
    VENUS(4.8675e+24, 6.0518e6),
    EARTH(5.9724e+24, 6.3710e6),
    MARS(6.4171e+23, 3.3895e6),
    JUPITER(1.8986e27, 6.9911e7),
    SATURN(5.6936e26, 5.8232e7),
    URANUS(8.6810e25, 2.5362e7),
    NEPTUNE(1.0243e26, 2.4764e7);
    
    // universal gravitational constant (m3 kg-1 s-2)
    public static final double G = 6.67300E-11;

    private final double mass; // in kilograms
    private final double radius; // in meters

    private Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }
    
    public double getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    public double surfaceGravity() {
        return G * mass / (radius * radius);
    }
}
