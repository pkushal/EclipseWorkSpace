
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World Programming");
		
		Animal animal = new Cat(10, 30);
		animal.sound();
		Animal anotherAnimal = new Animal(133,9383);
		anotherAnimal.sound();
		
		System.out.println(animal);
		System.out.println("-----------------separator----------------------------");
		System.out.println(anotherAnimal);
	}

}
