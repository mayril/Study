package com.ssafy.exception2;

public class UnCheckedExceptionTest {
	public static void main(String[] args) {
		UnCheckedExceptionTest c = new UnCheckedExceptionTest();
		
		// uncheckexception은 실행하는 메소드에서 선언
		try {
			c.method1();
		}catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}
	
	public void method1() {
		method2();
	}
	
	public void method2() {
		int i = 1 / 0;
	}
}
