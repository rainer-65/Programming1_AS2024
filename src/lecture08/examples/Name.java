package lecture08.examples;

public class Name implements Comparable<Name> {
	private final String LastName;
	private final String FirstName;
	
	public Name(String LastName, String FirstName) {
		this.LastName = LastName;
		this.FirstName = FirstName;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null || o.getClass() != this.getClass()) return false;
		
		Name otherName = (Name) o;
		return (this.LastName.equals(otherName.LastName) &&
				this.FirstName.equals(otherName.FirstName));
	}

	@Override
	public int compareTo(Name otherName) {
		int result = this.LastName.compareTo(otherName.LastName);
		if (result != 0) return result;
		
		// Only check the first names, if the last names were the same
		result = this.FirstName.compareTo(otherName.FirstName);
		return result;
	}
	
	@Override
	public String toString() {
		return LastName + ", " + FirstName;
	}
}
