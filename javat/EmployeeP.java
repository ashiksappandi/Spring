/*public abstract class EmployeeP{
	public String name;
	public String address;
	public int number;

	EmployeeP(String name, String address, int number){
		System.out.println("Constructing EmployeeP class..");
		this.name = name;
		this.address = address;
		this.number = number;
	}

	public void mailCheck(){
		System.out.println("Mailing a check to "+this.name+" "+this.address);
	}

	public String toString(){
		return name + ' '+ address + ' ' + number;
	}

	public String getName(){
		return name;
	}

	public String getAddress(){
		return address;
	}

	public void setAddress(String newAddress){
		address = newAddress;
	}

	public int getNumber(){
		return number;
	}
}
*/

public abstract class EmployeeP{
	public String name;
	public int age;

	public EmployeeP(String name, int age){
		this.name = name;
		this.age = age;
	}

	public void printData(){
		System.out.println("EmployeeP name:"+this.name+" - age:"+this.age);
	}

	public String getName(){
		return this.name;
	}

	public int getAge(){
		return this.age;
	}

}