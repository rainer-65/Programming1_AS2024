package lecture12.exercises;

public class Employee {

	private String name;
	private String idNum;
	private int age;

	// Two Constructors
	public Employee() {
	}

	public Employee(String name, String idNum, int age) {
		this.name = name;
		this.idNum = idNum;
		this.age = age;
	}

	// getter and setter-Methods
	public String getName() {
		return name;
	}

	public String getIdNum() {
		return idNum;
	}

	public int getAge() {
		return age;
	}

	public void setName(String newName) {
		name = newName;
	}

	public void setIdNum(String newId) {
		idNum = newId;
	}

	public void setAge(int newAge) {
		age = newAge;
	}

	// equals-Method
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;

		if (o == null) {
			return false;
		}

		if (!o.getClass().equals(this.getClass()))
			return false;

		Employee otherEmp = (Employee) o;
		return (this.name.equals(otherEmp.name)) && (this.idNum.equals(otherEmp.idNum)) && (this.age == otherEmp.age);
	}

	
	// toString-Method
	@Override
	public String toString() {
		return "Employee Name: " + this.getName() + " Employee Id: " + this.getIdNum() + " Employee Age: "
				+ this.getAge();

	}


}
