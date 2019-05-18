class Animal{
	public void move(){
		System.out.println("Animal can move");
	}
}

class Dog extends Animal{
	public void move(){
		super.move();
		System.out.println("Dog can move");
	}

	public void bark(){
		System.out.println("Dog can bark");
	}
}

public class AnimalOverloading{
	public static void main(String[] args) {
		Animal a = new Animal();
		Animal b = new Dog();
		a.move();
		b.move();
	}
}