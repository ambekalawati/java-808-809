package multithreading;

public class OddThread extends Thread{
	 
	 int count=0;
	 public OddThread(int count) {
		this.count=count; 
	 }
	public void run() {
		int i=1;
		while(i<=count) {
			if(i%2 !=0) {
				System.out.println(Thread.currentThread().getName()+" "+i);
			}
			i++;
		}
	}

}
