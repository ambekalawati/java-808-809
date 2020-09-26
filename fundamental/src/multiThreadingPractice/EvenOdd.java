package multiThreadingPractice;

import java.util.concurrent.atomic.AtomicInteger;

public class EvenOdd {
	public static void main(String[] args) {
		AtomicInteger atomic = new AtomicInteger(1);
		Runnable run = () -> {
			while (atomic.get() < 10) {
				synchronized (atomic) {
					if (atomic.get() % 2 == 0 && Thread.currentThread().getName().equals("Even")) {
						System.out.println("Even Thread " + atomic.getAndIncrement());
					} else if (atomic.get() % 2 != 0 && Thread.currentThread().getName().equals("Odd")) {
						System.out.println("Odd Thread " + atomic.getAndIncrement());
					}
				}
			}
		};
		Thread t1 = new Thread(run, "Odd");
		Thread t2 = new Thread(run, "Even");
		t1.start();
		t2.start();
	}

}
