package com.ssafy.inout2;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

//인터페이스가 적용되있는 Manager클래스
//적당한 예외처리가 적용
//풍부한 UI
//상속관계가 있는 데이터
//배열대신 List자료형 사용
//파일에 저장하는 기능
//파일에 있는 List를 생성자에서 불러오는 기능


//Generic이란?
//ArrayList vs LinkedList
//List Set Map이란?
//Set이 해쉬코드를 사용하므로, equals만으론 안되고 hashCode 필요

//입출력이란 ?
//File복사 ( xor 암호화 )
//보조스트림이란 ?
//BufferedReader + InputStreamReader 문자열로 효율적으로 읽기
//Serializable을 implements해야 객체 직렬화가 가능
//ObjectOutputStream의 writeObject , ObjectInputStream readObject(형변환필요) 를 통해 객체 읽고 쓰기

public class StudentListReadTest {
	public static void main(String[] args) {
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("studentList.dat"))){
			List<Student> list = (List<Student>) ois.readObject();
			for(Student s : list)
				System.out.println(s);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
