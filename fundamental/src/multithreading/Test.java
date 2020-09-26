package multithreading;

public class Test {

	public static void main(String[] args) {
		ThreadDemo demo = new ThreadDemo();
		demo.setName("Shail");
		demo.setPriority(1);

		demo.start();
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i + " " + Thread.currentThread().getPriority());
		}
	}

}
