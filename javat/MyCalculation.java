import java.io.*;


class Calculation {
	public void addition(int a, int b){
		int c = a+b;
		System.out.println("Sum of "+a+" & "+b+" is "+c);
	}

	public void subtraction(int a, int b){
		int c = a-b;
		System.out.println("Diff of "+a+" & "+b+" is "+c);
	}

	public void printNumber(int a, int b){
		System.out.println("Entered super number is "+a+" & "+b);
	}
}




public class MyCalculation extends Calculation{

	public static void multiplication(int a, int b){
		int c = a*b;
		System.out.println("Multiply of "+a+" & "+b+" is "+c);
	}

	public void printNumber(int a, int b){
		System.out.println("Entered sub number is "+a+" & "+b);
	}

	public void printSuperNumber(int a,int b){
		printNumber(a,b);
		super.printNumber(a,b);
	}

	public static void main(String[] args) {
		try{
			InputStreamReader a = new InputStreamReader(System.in);
			InputStreamReader b = new InputStreamReader(System.in);

			int x = a.read();
			int y = b.read();

			MyCalculation cal = new MyCalculation();
			Calculation supCal = new Calculation();
			cal.addition(x,y);
			cal.subtraction(x,y);
			multiplication(x,y);
			cal.printSuperNumber(x,y);
		}catch(Exception err){
			System.out.println(err);
		}
	}
}

/*
class Super_class {
   int num = 20;

   // display method of superclass
   public void display() {
      System.out.println("This is the display method of superclass");
   }
}

public class MyCalculation extends Super_class {
   int num = 10;

   // display method of sub class
   public void display() {
      System.out.println("This is the display method of subclass");
   }

   public void my_method() {
      // Instantiating subclass
      MyCalculation sub = new MyCalculation();

      // Invoking the display() method of sub class
      sub.display();

      // Invoking the display() method of superclass
      super.display();

      // printing the value of variable num of subclass
      System.out.println("value of the variable named num in sub class:"+ sub.num);

      // printing the value of variable num of superclass
      System.out.println("value of the variable named num in super class:"+ super.num);
   }

   public static void main(String args[]) {
      MyCalculation obj = new MyCalculation();
      obj.my_method();
   }
}
*/