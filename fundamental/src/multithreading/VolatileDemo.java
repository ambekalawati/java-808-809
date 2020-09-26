package multithreading;

import java.util.concurrent.atomic.AtomicBoolean;
// Q1- use of volatile keyword?
// Ans:- To resolve data visibility problem not data inconsistency problem.

public class VolatileDemo {
	public static void main(String[] args) throws InterruptedException {
		Task task = new Task();
		Thread t1 = new Thread(task, "First Thread");
		Thread t2 = new Thread(task, "Second Thread");
		t1.start();
		t2.start();
		Thread.sleep(1000);
		task.stop();
	}
}

class Task implements Runnable {
	private AtomicBoolean flag = new AtomicBoolean(true);

	@Override
	public void run() {
		while (flag.get()) {
			System.out.println(Thread.currentThread().getName());
		}
	}

	public void stop() {
		this.flag.set(false);
	}

}
