package lecture09.examples.gender;

/**
 * Used for addresses, for example "Herr Rolf Schmid"
 * Used for form-of-address at the start of a letter "Sehr geehrter Herr Schmid"
 */
public enum Gender {
	MALE("Herr", "Sehr geehrter"),
	FEMALE("Frau", "Sehr geehrte"),
	COUPLE("Familie", "Sehr geehrte"),
	COMPANY("", "Sehr geehrte Damen und Herren"); 
	
	private final String title;
	private final String opening;
	
	private Gender(String title, String opening) {
		this.title = title;
		this.opening = opening;
	}

	public String getTitle() {
		return title;
	}

	public String getOpening() {
		return opening;
	}
}
