package lecture09.examples.family;

import java.util.ArrayList;

public class Family {
	private ArrayList<Person> familyMembers;

	public Family() {
		familyMembers = new ArrayList<>();
	}
	
	// --- List management methods ---
	
	public Person get(int ID) {
		Person result = null;
		for (int i = 0; i < familyMembers.size() && result == null; i++) {
			Person p = familyMembers.get(i);
			if (p.getID() == ID) result = p;
		}
		return result;
	}
	
	public void add(Person p) {
		familyMembers.add(p);
	}
	
	public Person remove(Person p) {
		for (int i = 0; i < familyMembers.size(); i++) {
			if (familyMembers.get(i).equals(p))
				return familyMembers.remove(i); // found - remove and return
		}
		return null; // Not found
	}
	
	public ArrayList<Person> getAll() {
		return familyMembers;
	}
	
	// --- Business logic methods ---
	
	public ArrayList<Person> getGrandparents(Person p) {
		ArrayList<Person> grandparents = new ArrayList<>();
		if (p.getFather() != null) {
			if (p.getFather().getFather() != null) grandparents.add(p.getFather().getFather());
			if (p.getFather().getMother() != null) grandparents.add(p.getFather().getMother());
		}
		if (p.getMother() != null) {
			if (p.getMother().getFather() != null) grandparents.add(p.getMother().getFather());
			if (p.getMother().getMother() != null) grandparents.add(p.getMother().getMother());
		}
		return grandparents;
	}
}
