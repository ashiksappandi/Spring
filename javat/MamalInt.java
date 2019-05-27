package animals;

public class MamalInt implements Animal {

   public void eat() {
      System.out.println("Mammal eats");
   }

   public void travel() {
      System.out.println("Mammal travels");
   } 

   public int noOfLegs() {
      return 0;
   }

   public static void main(String args[]) {
      MamalInt m = new MamalInt();
      m.eat();
      m.travel();
   }
} 