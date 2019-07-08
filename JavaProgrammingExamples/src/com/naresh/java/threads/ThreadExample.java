package com.naresh.java.threads;

public class ThreadExample implements Runnable {

	public static void main(String[] args) throws InterruptedException {
		ThreadExample threadExample1 = new ThreadExample();
		Thread t1 = new Thread(threadExample1);
		t1.setName("First Thread");
		Thread t2 = new Thread(threadExample1);
		t2.setName("Second Thread");
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		System.out.println("Current Thread starts:::"+Thread.currentThread().getName());
		for(int i=1;i<=50;i++) {
			System.out.println("I value is:::"+i+":"+Thread.currentThread().getName());
		}
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Current Thread completed:::"+Thread.currentThread().getState());
	}
	

}
