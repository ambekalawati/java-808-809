package MethodOverloading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerBlockingQueue {
	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(5);
		BlockingQueue<Object> blockingQueue = new LinkedBlockingQueue<>();
		service.submit(new Producer(blockingQueue));
		service.submit(new Producer(blockingQueue));
		service.submit(new Producer(blockingQueue));
		service.submit(new Producer(blockingQueue));
		service.submit(new Producer(blockingQueue));

	}

}

class Producer implements Runnable {
	private BlockingQueue<Object> blockingQueue;

	public Producer(BlockingQueue<Object> blockingQueue) {
		super();
		this.blockingQueue = blockingQueue;
	}

	@Override
	public void run() {
		while (true) {
			try {
				blockingQueue.put("item");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " produce an item");
		}

	}

	class Consumer implements Runnable {
		private BlockingQueue<Object> blockingQueue;

		public Consumer(BlockingQueue<Object> blockingQueue) {
			super();
			this.blockingQueue = blockingQueue;
		}

		@Override
		public void run() {
			while (true) {
				Object item;
				try {
					item = blockingQueue.take();
					System.out.println(Thread.currentThread().getName() + " consume an " + item);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}

	}
}
