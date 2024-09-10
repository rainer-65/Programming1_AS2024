package lecture13.examples;

import java.util.*;

class Dog implements Comparator<Dog>, Comparable<Dog> {
	private String name;
	private int age;

	Dog() {
	}

	Dog(String n, int a) {
		name = n;
		age = a;
	}

	public String getDogName() {
		return name;
	}

	public int getDogAge() {
		return age;
	}

	// Interface Comparable
	// Overriding the compareTo method to sort the ages (Interface Comparable)
	public int compareTo(Dog d) {
		if (this.getDogAge() < d.getDogAge()) {
			return -1;
		} else if (this.getDogAge() > d.getDogAge()) {
			return 1;
		} else {
			return 0;
		}
	}

	// Overriding the compareTo method to sort the names (Interface Comparable)
	// public int compareTo(Dog d) {
	// return (this.name).compareTo(d.name);

	// Interface Comparator
	// Overriding the compare method to sort the age (Interface Comparator)
	public int compare(Dog d, Dog d1) {
		return d.age - d1.age;
	}
}

public class ExampleCompare {

	public static void main(String args[]) {
		// Takes a list o Dog objects
		List<Dog> list = new ArrayList<Dog>();

		list.add(new Dog("Shaggy", 3));
		list.add(new Dog("Lacy", 2));
		list.add(new Dog("Roger", 10));
		list.add(new Dog("Tommy", 4));
		list.add(new Dog("Tammy", 1));

		Collections.sort(list); // Sorts the array list using the Comparable
								// interface
		// Collections.sort(list, Collections.reverseOrder()); // Sorting in
		// reverse order using the Comparable interface
		System.out.print("Using the Comparable Interface: ");
		for (Dog a : list) // printing the sorted list of ages
			System.out.print(a.getDogName() + " : " + a.getDogAge() + ", ");

		System.out.println();

		Collections.sort(list, new Dog()); // Sorts the array list using the
											// Comparator interface
		System.out.print("Using the Comparator Interface: ");
		for (Dog a : list) // printing the sorted list of ages
			System.out.print(a.getDogName() + " : " + a.getDogAge() + ", ");
	}
}
