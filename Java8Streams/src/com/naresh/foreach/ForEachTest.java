/**
 * 
 */
package com.naresh.foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author Naresh Kumar S
 *
 */
public class ForEachTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,0);
		List<Integer> copyNumbers = new ArrayList<>() ;
		
		// Before Java 8
		
		Iterator itr = numbers.iterator();
		while(itr.hasNext()) {
			System.out.println("Number values is:::"+itr.next());
		}
		
		// Java 8 For Each
		
		numbers.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer arg0) {
				System.out.println("Values are :::"+arg0);
				copyNumbers.add(arg0);
			}
			
		});
		
		// Reusing the code - Implementation separated from the functionality - with same data structure input 
		MyConsumer consumer = new MyConsumer();
		copyNumbers.forEach(consumer);

	}
	
	
	

}
// You can reuse this method implementation when multiple times iterating the same structure
class MyConsumer implements Consumer<Integer>
{

	@Override
	public void accept(Integer t) {
		System.out.println("Iterated Values are:::"+t);
		
	}
	
}
