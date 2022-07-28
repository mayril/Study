package com.ssafy.exception2;

public class CheckedExceptionTest {
	public static void main(String[] args) {
		CheckedExceptionTest c = new CheckedExceptionTest();
		//checkexception은 오류나는 부분부터 try catch나 throws를 써야한다
		try {
			c.method1();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void method1() throws ClassNotFoundException {
		method2();
	}
	
	public void method2() throws ClassNotFoundException {
		Class.forName("Apple");
	}
}
