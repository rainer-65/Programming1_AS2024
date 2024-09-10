package lecture13.examples;

// Abstract class
public abstract class Person {

	private String name;
	private String gender;

	public Person(String nm, String gen) {
		this.name = nm;
		this.gender = gen;
	}

	// getter and setter-Methods
	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	// Abstract method
	public abstract void work();

	@Override
	public String toString() {
		return "Name = " + this.name + " Gender = " + this.gender;
	}

}
