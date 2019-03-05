package com.java.naresh;

public class Singleton {

	// Just declare singleton object without initialization
	private static Singleton singleton;

	private Singleton() {

	}

	public static void main(String[] args) {
		Singleton obj = Singleton.getSingletonObject();
		Singleton obj2 = Singleton.getSingletonObject();
		System.out.println("Object1:::" + obj + ":::" + obj2);
		// Here the both the objects will be same. It wont create new object, singleton
		// used to hold the single instqnce per application

	}

	public static Singleton getSingletonObject() {
		if (singleton == null) {
			System.out.println("First Time Creating Object");
			singleton = new Singleton();
		}
		return singleton;
	}

}
