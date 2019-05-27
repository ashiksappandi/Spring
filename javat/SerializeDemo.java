import java.io.*;

public class SerializeDemo{

	public static void main(String[] args) {
		EmployeeS e = new EmployeeS();
		e.name = "Ashik";
		e.age = 28;
		e.designation = "Engineer";
		e.salary = 5000.0;
		e.printData();

		try{
			FileOutputStream fileOut = new FileOutputStream("employee.ser");
			ObjectOutputStream obj = new ObjectOutputStream(fileOut);
			obj.writeObject(e);
			obj.close();
			fileOut.close();
			System.out.println("Serialized data is saved in employee.ser");
		}
		catch(IOException i){
			i.printStackTrace();
		}

	}
}