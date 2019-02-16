package com.naresh.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.naresh.streamtest.Person;

public class GenarateUtil {

	static Random random;
	static List<Person> persons = new ArrayList<>();

	public static List<Person> generatePersonList() {
		for (int i = 0; i < 10; i++) {
			Person person = new Person(100+i, "Sam" + i, "Anderson" + i, "Richard" + i, i);
			persons.add(person);
		}
		return persons;
	}

}
