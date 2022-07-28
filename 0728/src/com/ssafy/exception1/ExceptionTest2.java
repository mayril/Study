package com.ssafy.exception1;
//try catch문법을 통해 예외를 처리하면 프로그램 정상 종료 가능
public class ExceptionTest2 {
	public static void main(String[] args) {
		int[] nums = {10};
		
		if( 2 < nums.length)
			System.out.println(nums[2]);
		
		try {
			System.out.println(nums[2]);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열크기 넘어갔지롱");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
