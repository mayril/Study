package test;

import java.io.IOException;

public class Test {

	public static void main(String[] args) {
		try {

			m2();

		} catch (RuntimeException e) {
			System.out.println("dd");
		}

	}
	
	static public void m2()throws RuntimeException{
		//try {
			//throw new Exception();
		//} catch (Exception e) {
			System.out.println("mm");
			try {
				throw new IOException();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//}
	}

}
