package lecture09.examples.customer;

public class PostalAddress {
	private static int nextID = 0;
	
	private final int ID;
	private AddressType addressType;
	private String extra;
	private String streetAddress;
	private int postCode;
	
	public PostalAddress() {
		ID = nextID++;
	}
	
	public boolean equals(Object o) {
		if (o == null || o.getClass() != this.getClass()) return false;
		PostalAddress pa = (PostalAddress) o;
		return pa.ID == this.ID;
	}

	public AddressType getAddressType() {
		return addressType;
	}

	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}

	public String getExtra() {
		return extra;
	}

	public void setExtra(String extra) {
		this.extra = extra;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public int getPostCode() {
		return postCode;
	}

	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}

	public int getID() {
		return ID;
	}
}
