package inheritance;

public class Manager extends Person {
	Manager(){
		System.out.println("CT");
	}
	 {
		System.out.println("instance 2nd");
	}

	public static void main(String[] args) {
		Person p1 = new Manager();
		

	}

}
