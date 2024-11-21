package lecture09.examples.family;

import java.util.ArrayList;
import java.util.Scanner;

public class FamilyConsoleInterface {
	private static final Family family = new Family();
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		printCommandMenu();
		String command = in.nextLine();
		while (!command.equals("stop")) {
			runCommand(in, command);
			printCommandMenu();
			command = in.nextLine();
		}
		in.close();
	}

	private static void printCommandMenu() {
		System.out.println("Available commands:");
		System.out.println("  stop - end the program");
		System.out.println("  add - add new person to the family");
		System.out.println("  list - list all people in the database");
		System.out.println("  grandparents - display grandparents of a person");
		System.out.println("Enter a command:");
	}

	private static void runCommand(Scanner in, String command) {
		if (command.startsWith("add")) {
			add(in);
		} else if (command.equals("list")) {
			printAll();
		} else if (command.startsWith("grandparents")) {
			getGrandparents(in);
		} else {
			System.out.println("Unknown command");
		}
	}

	private static void add(Scanner in) {
		System.out.println("Enter the name: ");
		String name = in.nextLine();
		System.out.println("Enter the gender: m for male, anything else for female");
		String strGender = in.nextLine();
		Gender gender = (strGender.charAt(0) == 'm') ? Gender.MALE : Gender.FEMALE;
		Person newPerson = new Person(name, gender);
		
		System.out.println("Enter the ID of the father, or -1 for none");
		String strFather = in.nextLine();
		int idFather = Integer.parseInt(strFather);
		Person father = family.get(idFather);
		if (father != null) { // will be null if none
			newPerson.setFather(father);
			father.addChild(newPerson);
		}
		
		System.out.println("Enter the ID of the mother, or -1 for none");
		String strMother = in.nextLine();
		int idMother = Integer.parseInt(strMother);
		Person mother = family.get(idMother);
		if (mother != null) { // will be null if none
			newPerson.setMother(mother);
			mother.addChild(newPerson);
		}
		
		family.add(newPerson);
	}
	
	private static void printAll() {
		for (Person p : family.getAll()) {
			System.out.println(p);
		}
	}
	
	private static void getGrandparents(Scanner in) {
		System.out.println("Enter the ID of the person: ");
		String sID = in.nextLine();
		int ID = Integer.parseInt(sID);
		Person grandkid = family.get(ID);
		if (grandkid != null) {
			ArrayList<Person> grandparents = family.getGrandparents(grandkid);
			for (Person p : grandparents) {
				System.out.println(p);
			}
		} else {
			System.out.println("Person not found");
		}
	}
}
