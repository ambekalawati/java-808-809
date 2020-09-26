package oops;

public class ObjectCount {
	static int count;
	{
		count++;
	}
	ObjectCount(){
		System.out.println(count);
	}
	public static void main(String[] args) {
		new ObjectCount();
		new ObjectCount();
		new ObjectCount();
		new ObjectCount();
	}

}
