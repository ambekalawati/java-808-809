package inheritance;

public class Cat implements Walk,Run{
	public int getSpeed() {
		return 5;
	}

	public static void main(String[] args) {
		Cat an = new Cat();
		System.out.println(an.getSpeed());
		
		

	}

}
