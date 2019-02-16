package com.naresh.streamtest;

import java.util.List;
import java.util.stream.Collectors;

import com.naresh.util.GenarateUtil;

public class StreamTest {

	public static void main(String[] args) {
		
		List<Person> persons = GenarateUtil.generatePersonList();

		// Stream the Person list
		persons.stream().map(p->p.getAge()).filter(p -> p > 5).collect(Collectors.toList());

		System.out.println("person values are:::" + persons.size());

	}

}
