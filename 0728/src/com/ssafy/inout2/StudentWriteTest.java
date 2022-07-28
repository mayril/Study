package com.ssafy.inout2;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentWriteTest {
	public static void main(String[] args) {
		Student s = new Student(10, "Hong");
		//상대경로 : 현재위치로부터의 경로
		//절대경로 : 루트로부터의 경로
		try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("student.dat"))){
			os.writeObject(s);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
