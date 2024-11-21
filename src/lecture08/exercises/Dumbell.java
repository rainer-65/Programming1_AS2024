package lecture08.exercises;

import java.util.ArrayList;

/**
 * No unique ID: Dumbells are defined solely by their total weight.
 * The weight of the bar is be 2kg.
 */
public class Dumbell implements Comparable<Dumbell> {
	private final double barWeight = 2.0;
	private final ArrayList<Double> discs;
	
	public Dumbell() {
		this.discs = new ArrayList<>();
	}
	
	public void addWeight(double disc) {
		discs.add(disc);
	}
	
	public double getTotalWeight() {
		double total = barWeight;
		for (double disc : discs)
			total += disc;
		return total;
	}
	
	public boolean equals(Object o) {
		if (o == null || o.getClass() != this.getClass()) return false;
		Dumbell h = (Dumbell) o;
		return h.getTotalWeight() == this.getTotalWeight();
	}

	@Override
	public int compareTo(Dumbell h) {
		if (this.getTotalWeight() < h.getTotalWeight()) return -1;
		else if (this.getTotalWeight() > h.getTotalWeight()) return 1;
		else return 0;
	}
}
