package com.naresh.java.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExamaple {

	public static void main(String[] args) {
		Map<String,String> hashMap = new HashMap<>();
		hashMap.put("key1","value1");
		hashMap.put("key2","value2");
		hashMap.put("key3","value3");
		hashMap.put("key1","value4");
		System.out.println("Hash Map values are::::"+hashMap.get("key1"));
	}

}
