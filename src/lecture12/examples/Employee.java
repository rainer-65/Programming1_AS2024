package lecture12.examples;

public class Employee {

	private String name;
	private String idNum;
	private int age;

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getIdNum() {
		return idNum;
	}

	public void setAge(int newAge) {
		age = newAge;
	}

	public void setName(String newName) {
		name = newName;
	}

	public void setIdNum(String newId) {
		idNum = newId;
	}

	// equals-Method
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;

		if (o == null) {
			return false;
		}

		if (!o.getClass().equals(this.getClass())) {
			return false;
		}
			
		Employee otherEmp = (Employee) o;
		return (this.name.equals(otherEmp.name)) && (this.idNum.equals(otherEmp.idNum)) && (this.age == otherEmp.age);
	}

}
