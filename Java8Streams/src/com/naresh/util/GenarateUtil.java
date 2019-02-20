package com.naresh.util;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.naresh.streamtest.Person;

public class GenarateUtil {
	/**
	 * 
	 * @return
	 */
	public static List<Person> generatePersonList() {

		return Arrays.asList(new Person(100, "Jahnavi", "Naresh", "Kumar", 2),
				new Person(101, "Ramesh", "Jagan", "Samson", 20), new Person(102, "Ravindra", "Sir", "Jadeja", 27),
				new Person(103, "Rishap", "Pant", "Sarwan", 25), new Person(103, "Rishap", "Pant", "Sarwan", 25),
				new Person(105, "Mahendra", "Singh", "Dhone", 26), new Person(106, "Yuvraj", "Swapnam", "Sigh", 29),
				new Person(107, "Manish", "Pandey", "Kumar", 34), new Person(108, "Rajat", "Patiya", "Narmar", 33),
				new Person(109, "VVS", "Laxman", "Reddy", 66));
	}

	/**
	 * 
	 * @return
	 */
	public static Map<String, Person> generateMaps() {
		Map<String, Person> personsMap = new HashMap<>();
		personsMap.put("100", new Person(100, "Jahnavi", "Naresh", "Kumar", 2));
		personsMap.put("101", new Person(101, "Ramesh", "Jagan", "Samson", 20));
		personsMap.put("102", new Person(102, "Ravindra", "Sir", "Jadeja", 27));
		return personsMap;
	}
	
	

}
