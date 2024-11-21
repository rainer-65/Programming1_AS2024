package lecture04.exercises;

public class Company {
	private int ID;
	private String name;
	private String town;
	private int numberEmployee;
	
	public Company(int ID) {
		this.ID = ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (!name.isEmpty()) this.name = name;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		if (!town.isEmpty()) this.town = town;
	}

	public int getNumberEmployee() {
		return numberEmployee;
	}

	public void setNumberEmployee(int numberEmployee) {
		if (numberEmployee > 0) this.numberEmployee = numberEmployee;
	}

	public int getID() {
		return ID;
	}
	
	
}
