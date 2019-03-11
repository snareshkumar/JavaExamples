package com.naresh.javaprograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueWithoutUsingSet {

	public static void main(String[] args) {
		List<String> records = Arrays.asList("Naresh","Samesh","Suresh","Naresh","Ramesh","Naresh");
		System.out.println("Records::::"+records);
		records = records.stream().distinct().collect(Collectors.toList());
		records.forEach(s->{
			System.out.print(s);
		});

	}

}
