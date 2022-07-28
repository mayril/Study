package com.ssafy.inout2;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class StudentListWriteTest {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(1, "Hong"));
		list.add(new Student(3, "Kim"));
		list.add(new Student(2, "Park"));
		list.add(new Student(5, "Kang"));
		list.add(new Student(7, "Song"));
		list.add(new Student(11, "Yoon"));
		
		try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("studentList.dat"))){
			os.writeObject(list);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
