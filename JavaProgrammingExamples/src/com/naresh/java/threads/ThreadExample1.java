package com.naresh.java.threads;

public class ThreadExample1 extends Thread {

	public ThreadExample1(String threadName) {
		setName(threadName);
	}

	public static void main(String[] args) {

		 new ThreadExample1("FirstThread").start();
		 new ThreadExample1("SecondThread").start();
		System.out.println("Thread Execution finished successfully");
	}

	@Override
	public void run() {
		long executionStartTime = System.currentTimeMillis();
		System.out.println(
				"Execution starts threadname:::" + Thread.currentThread().getName() + "::" + executionStartTime);
		for (int i = 0; i <= 50000; i++) {
			System.out.println("Running:::"+i+"::"+Thread.currentThread().getName());
		}
		long executionEndTime = System.currentTimeMillis() - executionStartTime;
		System.out.println(
				"Execution end threadname:::" + Thread.currentThread().getName() + "::" + executionEndTime);

	}

}
