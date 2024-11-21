package lecture09.examples.gender;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * A simplified version of the customer class, used to
 * demonstrated an advanced "Gender" enumeration
 */
public class Customer {
	private static int nextID = 0;
	
	private final int ID;
	private String firstName;
	private String lastName;
	private Gender gender;
	private String userName;
	private String password;
	private LocalDate birthDate;
	private String email;
	private String phoneNumber;
	
	public Customer() {
		this.ID = nextID++;
	}
	
	public boolean equals(Object o) {
		if (o == null || o.getClass() != this.getClass()) return false;
		Customer c = (Customer) o;
		return c.ID == this.ID;
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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
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

	public int getID() {
		return ID;
	}

}
