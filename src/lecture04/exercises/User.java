package lecture04.exercises;

public class User {
	private static int nextID = 0;
	
	private final int ID;
	private String userName;
	private String password;

	private static int getNextID() {
		return nextID++;
	}
	
	public User() {
		this.ID = getNextID();
	}
	
	@Override
	public String toString() {
		return userName + " " + ID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		if (userName.contains("@"))	this.userName = userName;
		else System.out.println(userName + " is not a valid email address");
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (password.length() >= 6) this.password = password;
		else System.out.println("Password must be at least 6 characters");

	}

	public int getID() {
		return ID;
	}

}
