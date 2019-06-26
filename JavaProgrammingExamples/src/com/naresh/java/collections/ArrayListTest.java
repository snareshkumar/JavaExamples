/**
 * 
 */
package com.naresh.java.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Naresh Kumar S
 *
 */
public class ArrayListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Jadeja");
		names.add("Suresh");
		names.add("Ramesh");
		names.add("Samesh");
		names.add("Raghav");
		names.add("Paul");
		names.stream().forEach(System.out::println);
		

	}

}
