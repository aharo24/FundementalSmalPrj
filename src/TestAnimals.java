import java.util.Scanner ;
class TestAnimals {
	public static Scanner KB = new Scanner(System.in);
	public static void main(String[] args) {
		Animal myAnimal = new Animal();  // Create a Animal object
		Cat myCat = new Cat("Med","Fluffy",1111);  // Create a Cat object
		Dog myDog = new Dog();  // Create a Dog object
		myAnimal.sound();
		System.out.println();
		myCat.sound();
		myDog.sound();
		String temp = KB.nextLine();
		myDog.setName(temp);
		myDog.setId(myCat.getId() + 1);
		myDog.setBreed("German Shepherd");
		System.out.println(myCat + "\n" + myDog);
	}
}