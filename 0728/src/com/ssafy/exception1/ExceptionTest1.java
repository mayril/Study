package com.ssafy.exception1;
//예외가 발생하면 프로그램이 종료된다는 것을 확인.
public class ExceptionTest1 {
	public static void main(String[] args) {
		int[] nums = {10};
		System.out.println(nums[2]);
		System.out.println("프로그램을 종료합니다.");
	}
}
