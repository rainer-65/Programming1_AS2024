package lecture13.examples;

public class EmployeeTest {

	public static void main(String[] args) {
		try {
			Employee emp = new Employee("Miller", 50000);
			Employee empClone = (Employee) emp.clone();

			System.out.println("EMP --> name: " + emp.getName() + ", salary: " + emp.getSalary());
			System.out.println("EMP CLONE --> name: " + empClone.getName() + ", salary: " + empClone.getSalary());
			empClone.setName("Johnson");
			empClone.setSalary(100000);
			System.out.println("EMP --> name: " + emp.getName() + ", salary: " + emp.getSalary());
			System.out.println("EMP CLONE --> name: " + empClone.getName() + ", salary: " + empClone.getSalary());

		} catch (CloneNotSupportedException ce) {
			ce.printStackTrace();
		}
	}
}
