package lecture09.examples.customer;

import java.time.LocalDate;
import java.util.ArrayList;

public class Customer {
	private static int nextID = 0;
	
	private final int ID;
	private String title;
	private String firstName;
	private String lastName;
	private Language language;
	private String userName;
	private String password;
	private LocalDate birthDate;
	private String email;
	private String phoneNumber;
	private ArrayList<PostalAddress> addresses;
	
	public Customer() {
		this.ID = nextID++;
		addresses = new ArrayList<>();
	}
	
	public boolean equals(Object o) {
		if (o == null || o.getClass() != this.getClass()) return false;
		Customer c = (Customer) o;
		return c.ID == this.ID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public ArrayList<PostalAddress> getAddresses() {
		return addresses;
	}

	public void setAddresses(ArrayList<PostalAddress> addresses) {
		this.addresses = addresses;
	}

	public int getID() {
		return ID;
	}

}
