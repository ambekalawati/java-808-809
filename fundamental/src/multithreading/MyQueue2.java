package multithreading;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
//Q. Calculate sum from 1 to 10,000 using 2 threads?
//Q. Producer-Consumer problem using Blocking Queue?
public class MyQueue2 {
	private Queue<String> queue;
	private int max = 16;
	private ReentrantLock lock = new ReentrantLock();
	private Condition notEmpty = lock.newCondition();
	private Condition notFull = lock.newCondition();

	public MyQueue2(int max) {
		super();
		this.max = max;
		this.queue = new LinkedList<>();
	}

	public void put(String item) {
		lock.lock();
		try {
			while (queue.size() == max) {
				notFull.await();
			}
			queue.add(item);
			notEmpty.signalAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}

	public  String take() {
		lock.lock();
		String item = null;
		try {
			while (queue.size() == 0) {
				notEmpty.await();
			}
			item = queue.remove();
			notFull.signalAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
		return item;
	}

}
