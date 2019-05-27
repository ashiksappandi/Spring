public class EmployeeS implements java.io.Serializable{
	public String name;
	public int age;
	public String designation;
	public double salary;

	public void printData(){
		System.out.println(name+" with age "+age+", being "+designation+" earns $"+salary);
	}
}