package com.ssafy.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTest {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		
		list.add("Hi");
		list.add("Welcome");
		list.add("Java");
		list.add("World");
		
		Collections.sort(list);
		
		System.out.println(list);
	}
}
