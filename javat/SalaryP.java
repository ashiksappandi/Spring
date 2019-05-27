/*public class SalaryP extends EmployeeP{
   private double salary;   // Annual salary
   
   public SalaryP(String name, String address, int number, double salary) {
      super(name, address, number);
      setSalary(salary);
   }
   
   public void mailCheck() {
      System.out.println("Within mailCheck of Salary class ");
      System.out.println("Mailing check to " + getName() + " with salary " + salary);
   }
 
   public double getSalary() {
      return salary;
   }
   
   public void setSalary(double newSalary) {
      if(newSalary >= 0.0) {
         salary = newSalary;
      }
   }
   
   public double computePay() {
      System.out.println("Computing salary pay for " + getName());
      return salary/52;
   }
}*/

public class SalaryP extends EmployeeP{
	private double salary;

	public SalaryP(String name, int age, double salary){
		super(name, age);
		this.salary = salary;
	}

	public void printData(){
		System.out.println("SalaryP name:"+this.name + " - age:"+this.age+" - salary:"+this.salary);
	}

	public void printData(String name, int age){
		super.printData();
	}
}