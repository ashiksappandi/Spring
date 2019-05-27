import java.io.*;

public class DeserializeDemo{
	public static void main(String[] args) {
		EmployeeS e = null;
		try{
			FileInputStream fileIn = new FileInputStream("employee.ser");
			ObjectInputStream obj = new ObjectInputStream(fileIn);
			e = (EmployeeS) obj.readObject();
			obj.close();
			fileIn.close();
		}
		catch(IOException i){
			i.printStackTrace();
			return;
		}
		catch(ClassNotFoundException c){
			c.printStackTrace();
			return;
		}

		System.out.println("Deserialized Employee...");
      	System.out.println("Name: " + e.name);
	    System.out.println("Age: " + e.age);
	    System.out.println("Designation: " + e.designation);
	    System.out.println("Salary: " + e.salary);
	}
}