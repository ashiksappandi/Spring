import java.io.*;

public class Employee{
	public String name;
	private int age;
	public String designation;
	private double salary;

//	public static void main(String args[]) {
		//Employee h1 = new Employee();
//		System.out.println(h1.printSalary());
//	}

	public Employee(String name){
		this.name = name;
	}

	public void empAge(int empAge){
		age = empAge;
	}

	public void empDesignation(String empDesignation){
		designation = empDesignation;
	}

	public void empSalary(double empSalary){
		salary = empSalary;
	}

	public void printEmployee(){
		System.out.println("Name: "+ name);
		System.out.println("Age: "+ age);
		System.out.println("Designation: "+ designation);
		System.out.println("Salary: "+salary);
	}

	private String printSalary(){
		return "Private Salary:";	
	}
}