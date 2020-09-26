package oops;

public class Student {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<0) {
			System.out.println("you foolish user age should not be negative");
			return;
		}	this.age = age;
	}
	
	


}
