package lecture13.examples;

public class ClerkExample implements Cloneable {

	public static void main(String args[]) {
		// Coding in terms of abstract classes
		Clerk clerkA = new Clerk("Maier", "Female", 0);
		Clerk clerkB = new Clerk("Studer", "Male", 123);

		// Hire a Person
		System.out.println("Hiring Date of " + clerkA.getName() + ": " + clerkA.getHiringDate());

		// Working info
		System.out.print(clerkA.toString() + ": ");
		clerkA.work();
		System.out.print(clerkB.toString() + ": ");
		clerkB.work();
	}

}
