package com.ssafy.collection.set;

import java.util.Objects;

public class Person {
	String name;
	String personNumber;

	public Person() {
	}

	public Person(String name, String personNumber) {
		this.name = name;
		this.personNumber = personNumber;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
//		if (getClass() != obj.getClass())
//			return false;
		Person other = (Person) obj;
		return personNumber.equals(other.personNumber);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(personNumber);
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", personNumber=" + personNumber + "]";
	}
}