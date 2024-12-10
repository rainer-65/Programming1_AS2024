package lecture11.exercises;

class Car extends Vehicle {

    public Car(int id, String manufacturer, double trunkCapacity) {
        super(id, manufacturer);
        this.trunkCapacity = trunkCapacity;
    }

    private double trunkCapacity;

    public double getTrunkCapacity() {
        return trunkCapacity;
    }

    public void setTrunkCapacity(double trunkCapacity) {
        this.trunkCapacity = trunkCapacity;
    }

    @Override
    public String toString() {
        return getId() + " " + getManufacturer() + " " + getTrunkCapacity();
    }
}
