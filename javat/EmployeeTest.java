import java.io.*;

public class EmployeeTest{

	public static void main(String[] args) {
		Employee empOne = new Employee("Milton");	
		Employee empTwo = new Employee("Hilton");

		empOne.empAge(28);
		empOne.empDesignation("Engineer");
		empOne.empSalary(1000);
		empOne.printEmployee();

		empTwo.empAge(30);
		empTwo.empDesignation("Senior Engineer");
		empTwo.empSalary(2000);
		empTwo.printEmployee();
	}
}
