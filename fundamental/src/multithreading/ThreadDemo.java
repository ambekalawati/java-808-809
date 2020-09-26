package multithreading;
/**
 * MultiProgramming
 * Multitasking
 * MultiThreading
 * Process:The program under execution is called Process.
 * 1. execution: It should reside in Physical Memory(RAM).
 * 2.   It occupied the CPU to execute the instruction.
 * Attributes Of  a Process
 * 1.Process Id
 * 2.Process State 
 * 3.Program Counter
 * 4.Priority
 *   
 * Thread: It is a light Weight(no. of instructions) Process
 *  Responsiveness(latency)
 * Starvation
 * DeadLock
 * Concurrency
 * Parallelism
 * Context Switching :Saving the context(instructions) of one procee
 * and loading the context of another process is called as 
 * context switchimg.
 * 
 * Q.Difference between process and Thread?
 * Resource(code ,data, memory,file,stack,register) Sharing:
 * The resources like code ,data and memory(RAM) will be shared
 * among all the thread.But in a thread every thread has its 
 * own stack.
 * 
 * @author HP
 *
 */
public class ThreadDemo extends Thread{

// How we can create Thread in Java?
// There are 3 ways we can create a Thread.
//1.By extending Thread class.
//2. By implementing Runnable Interface.
//3.By implementing Future Interface.
public void run() {
for(int i=0;i<10;i++) {
	
	System.out.println(Thread.currentThread().getName()+" "+i+" "+Thread.currentThread().getPriority());
}
}
}






