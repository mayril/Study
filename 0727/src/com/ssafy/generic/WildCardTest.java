package com.ssafy.generic;

class Person{
	
}
class Student extends Person{
	
}

class PersonBox<T>{
	
}
public class WildCardTest {

	public static void main(String[] args) {
		PersonBox<Object> pobj= new PersonBox<>();
		PersonBox<Person> pper= new PersonBox<>();
		PersonBox<Student> pst= new PersonBox<>();
		
		PersonBox<?> pAll=pobj;
		pAll=pper;
		pAll=pst;
		
		PersonBox<? extends Person> pChild=pper;
		pChild=pst;
		//pChild=pobj
		PersonBox<? super Person> pSuper=pper;
		//pSuper =pst
	}

}
