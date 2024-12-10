package lecture11.exercises;

public class EmployeeTest {

	public static void main(String args[]) {
		// Creating objects
		Employee employee = new Employee();
		employee.setName("James Miller");
		employee.setIdNum("123456A");
		employee.setAge(20);
		Employee employee2 = new Employee("Bernie Johnson", "999432B", 43);
		
		// Using the toString Method
		System.out.println("Employee Data: " + employee.toString());
		System.out.println("Employee Data: " + employee2.toString());
	}
}
