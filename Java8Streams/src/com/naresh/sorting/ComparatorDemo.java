package com.naresh.sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.naresh.streamtest.Person;
import com.naresh.util.GenarateUtil;

public class ComparatorDemo {

	public static void main(String[] args) {
		
		List<Person> persons = GenarateUtil.generatePersonList();
		
		// Comparator is used for multilevel sorting mechanism in java
		
		// Sort Based on the Age ascending order
		Collections.sort(persons, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getAge()-o2.getAge();
			}
		});
		persons.stream().map(s->s.getAge()).forEach(System.out::println);
		
		// Sorting Based on the Name
		
		Collections.sort(persons, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getPersonFirstName().compareTo(o2.getPersonFirstName());
			}
		});
		
		persons.stream().map(s->s.getPersonFirstName()).forEach(System.out::println);

	}

}
