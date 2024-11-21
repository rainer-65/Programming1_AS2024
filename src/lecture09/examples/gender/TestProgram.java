package lecture09.examples.gender;

public class TestProgram {

	public static void main(String[] args) {
		Customer c = new Customer();
		c.setLastName("Schmid");
		c.setGender(Gender.MALE);
		System.out.println(getFormOfAddress(c));
		
		c.setGender(Gender.FEMALE);
		System.out.println(getFormOfAddress(c));
		
		c.setGender(Gender.COUPLE);
		System.out.println(getFormOfAddress(c));
		
		c.setGender(Gender.COMPANY);
		System.out.println(getFormOfAddress(c));
	}

	private static String getFormOfAddress(Customer c) {
		Gender g = c.getGender();
		String s;
		if (g != Gender.COMPANY) {
			s = g.getOpening() + " " + g.getTitle() + " " + c.getLastName();
		} else {
			s = g.getOpening();
		}
		return s;
	}
}
