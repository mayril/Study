package com.ssafy.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortTest2 {
	public static void main(String[] args) {
		
		List<Person> list = new ArrayList<>();
		
		list.add(new Person("Mike1", "123"));
		list.add(new Person("Mike4", "321"));
		list.add(new Person("Mike2", "456"));
		list.add(new Person("Mike3", "222"));
		list.add(new Person("Mike5", "345"));
		
		
		Collections.sort(list);
		
//		Collections.sort(list, new Comparator<Person>() {
//
//			@Override
//			public int compare(Person o1, Person o2) {
//				return o1.name.compareTo(o2.name);
//			}
//		});
		
		System.out.println(list);
	}
}
