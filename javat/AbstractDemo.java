/*public class AbstractDemo{
	public static void main(String[] args) {
		SalaryP s = new SalaryP("Hilton","US",2, 3000.0);
		EmployeeP e = new SalaryP("Milton", "UAE", 3, 500.0);
		s.mailCheck();
		e.mailCheck();
	}
}*/

public class AbstractDemo{
	public static void main(String[] args) {
		EmployeeP e = new SalaryP("Ashik",28,3000.0);
		SalaryP s = new SalaryP("Narayan",65,5000.0);

		s.printData(e.getName(), e.getAge());
		s.printData();
	}
}