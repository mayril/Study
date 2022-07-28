package com.ssafy.generic1;

class ClassName<T> {

}

public class Test {
	public static void main(String[] args) {
		ClassName<String> generic = new ClassName<String>();
		ClassName<String> generic2 = new ClassName<>();
		ClassName generic3 = new ClassName();
	}
}
