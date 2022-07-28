package com.ssafy.collection.set;

import java.util.HashSet;
import java.util.Set;


public class SetTest {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Hong");
		set.add("Kim");
		set.add("Hong");
		System.out.println(set);

		Set<Person> personSet = new HashSet<>();
		personSet.add(new Person("Hong", "123"));
		personSet.add(new Person("Kim", "123"));
		System.out.println(personSet);
	}
}
