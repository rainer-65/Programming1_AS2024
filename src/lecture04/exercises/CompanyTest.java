package lecture04.exercises;

import java.util.Scanner;

public class CompanyTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an ID");
		int ID = in.nextInt();
		in.nextLine();
		System.out.println("Enter company name");
		String name = in.nextLine();
		System.out.println("Enter town");
		String companyHome = in.nextLine();
		System.out.println("How many employees?");
		int number = in.nextInt();
		in.close();
		
		Company myCompany = new Company(ID);
		myCompany.setName(name);
		myCompany.setTown(companyHome);
		myCompany.setNumberEmployee(number);
		
		System.out.println("Info about company " + myCompany.getID());
		System.out.println("Company name is " + myCompany.getName());
		System.out.println("Company home is " + myCompany.getTown());
		System.out.println("Company has " + myCompany.getNumberEmployee() + " employees");
	}

}
