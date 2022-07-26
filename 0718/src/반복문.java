import java.util.Scanner;

public class 반복문 {
	public static void main(String[] args) {
		System.out.println("Hello world1");
		System.out.println("Hello world2");
		System.out.println("Hello world3");
		System.out.println("Hello world4");
		System.out.println("Hello world5");
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Hello world" + (i+1));//i:01234
		}
		
		for(int i = 2; i <= 9; i++) {
			System.out.println("2*" + (i) + "=" + (i*2));
		}
		
		System.out.println("2*2=4");
		System.out.println("2*3=6");
		System.out.println("2*4=8");
		System.out.println("2*5=10");
		System.out.println("2*6=12");
		System.out.println("2*7=14");
		System.out.println("2*8=16");
		System.out.println("2*9=18");
		
		
	}
}