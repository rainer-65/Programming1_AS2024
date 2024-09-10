package lecture12.examples;

public class EmployeeTest {

	public static void main(String args[]) {
		Employee employee = new Employee();
		employee.setName("James Miller");
		employee.setIdNum("123456A");
		employee.setAge(20);
		System.out.println("Name: " + employee.getName() + " Id: " + employee.getIdNum() + " Age: " + employee.getAge());
		
		// Use getClass() method
		System.out.println("Type of object employee: " + employee.getClass().getSimpleName());
	}
}
