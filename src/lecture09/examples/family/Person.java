package lecture09.examples.family;

import java.util.ArrayList;

public class Person {
	private static int nextID = 0;
	
	private final int ID;
	private final ArrayList<Person> children;
	private String name;
	private Gender gender;
	private Person father;
	private Person mother;
	
	public Person(String name, Gender gender) {
		this.ID = nextID++;
		this.children = new ArrayList<>();
		this.name = name;
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "ID " + ID + ": " + name + " (" + gender + ")";
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null || o.getClass() != this.getClass()) return false;
		Person p = (Person) o;
		return p.ID == this.ID;
	}
	
	// --- Getters and Setters ---

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Person getFather() {
		return father;
	}

	public void setFather(Person father) {
		this.father = father;
	}

	public Person getMother() {
		return mother;
	}

	public void setMother(Person mother) {
		this.mother = mother;
	}

	public ArrayList<Person> getChildren() {
		return children;
	}

	public void addChild(Person p) {
		children.add(p);
	}

	public int getID() {
		return ID;
	}
}
