package com.naresh.streamtest;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.naresh.util.GenarateUtil;

public class StreamTest {

	public static void main(String[] args) {

		List<Person> persons = GenarateUtil.generatePersonList();

		// Stream Test - Get Only Ages which is greater than 30 - Output list only has
		// ages which is greater than 30
		// Here Map is the stream function which is only getting age value and condition
		// given in the stream filter

		List<Integer> result = persons.stream().map(p -> p.getAge()).filter(p -> p.intValue() > 30)
				.collect(Collectors.toList());
		System.out.println("Result Size Is :::" + result);

		// Getting List of Names from HashMap using stream and filter

		Map<String, Person> persons1 = GenarateUtil.generateMaps();
		List<String> firstNames = persons1.entrySet().stream().map(p -> p.getValue().getPersonFirstName())
				.filter(p -> p.equalsIgnoreCase("jahnavi")).collect(Collectors.toList());
		System.out.println("firstNames:::" + firstNames);

	}

}
