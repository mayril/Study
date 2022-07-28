package com.ssafy.exception1;

public class ExceptionTest3 {
	public static void main(String[] args) {
		int[] nums = {10};
		
		try {
			System.out.println(nums[2]);
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램을 종료합니다.");
	}
}
