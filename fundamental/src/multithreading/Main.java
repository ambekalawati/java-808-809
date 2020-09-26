package multithreading;

public class Main {

	public static void main(String[] args) {
		OddThread o = new OddThread(50);
		o.setName("Odd thread");
		o.start();
	}

}
