package inheritance;

public class Dog extends Animal {
	void sound() {
		System.out.println("Bark");
	}
	void run() {
		System.out.println("Dog run");
	}

	public static void main(String[] args) {
		Animal dog = new Dog();
		//dog.sound();
		dog.run();
		

	}

}
