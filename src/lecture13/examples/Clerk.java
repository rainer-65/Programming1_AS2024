package lecture13.examples;

import java.time.LocalDate;

public class Clerk extends Person implements Employable {

	private int clerkId;

	public Clerk(String nm, String gen, int id) {
		super(nm, gen);
		this.clerkId = id;
	}

	@Override
	public void work() {
		if (clerkId == 0) {
			System.out.println("Currently not working!");
		} else {
			System.out.println("Working as clerk!");
		}
	}

	// Implementing the hire method of the Interface
	public LocalDate getHiringDate() {
		LocalDate hireDate = LocalDate.now();
		return hireDate;

	}

	// Implementing the fire method of the Interface
	public LocalDate getFiringDate() {
		LocalDate fireDate = LocalDate.now();
		return fireDate;

	}

}
