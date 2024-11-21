package lecture09.examples.customer;

public class PostCode {
	private int postCode;
	private String town;
	private String canton;
	
	public PostCode() {
		// No content
	}
	
	public boolean equals(Object o) {
		if (o == null || o.getClass() != this.getClass()) return false;
		PostCode pc = (PostCode) o;
		return pc.postCode == this.postCode;
	}

	public int getPostCode() {
		return postCode;
	}

	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getCanton() {
		return canton;
	}

	public void setCanton(String canton) {
		this.canton = canton;
	}
}
