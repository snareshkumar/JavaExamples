/**
 * 
 */
package com.naresh.java.threads;

/**
 * @author Naresh Kumar S
 *
 */
public class ThreadPriority extends Thread{

	/**
	 * @param args
	 */
	public ThreadPriority(String name) {
		setName(name);
	}
	public static void main(String[] args) {
		ThreadPriority t1 = new ThreadPriority("FirstThread");
		t1.setPriority(NORM_PRIORITY);
		ThreadPriority t2 = new ThreadPriority("SecondThread");
		t2.setPriority(MAX_PRIORITY);
		t1.start();
		t2.start();

	}
	
	@Override
	public void run() {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i<=1000; i++) {
			System.out.println("Value is:::"+i+"::"+Thread.currentThread().getName());
		}
		long endTime = System.currentTimeMillis()-startTime;
		System.out.println("Time Taken:::"+endTime+"::"+Thread.currentThread().getName());
		
	}

}
