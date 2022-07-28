package com.ssafy.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {

		// 문자열을 저장할 List, 구현체는 ArrayList
		List<String> names = new ArrayList<>();

		// 추가
		names.add("양만춘");
		names.add("양만춘");
		names.add("홍길동");
		names.add("양만춘");
		names.add("이순신");
		names.add(0, "임꺽정");

		System.out.println(names);

		// 비었는지 체크
		System.out.println(names.isEmpty());
		// 원소수
		System.out.println(names.size());

//		for (int i = 0; i < names.size(); i++) {
//			System.out.println(names.get(i));
//		}

		// 수정
		// 2번째 사람을 세종대왕으로 고쳐라
		names.set(1, "세종대왕");
//		System.out.println(names.get(1));

		// 삭제
		names.remove(0);// 특정위치 삭제
		names.remove("세종대왕");
//		for (int i = 0; i < names.size(); i++) {
//			System.out.println(names.get(i));
//		}
//		
		names.clear();
		names.add("양");
		names.add("양");
		names.add("킴");
		
		//삭제를 하려고할 때 발생할 수 있는 이슈
		//앞에서부터 삭제할때 
//		for(int i =  0 ; i <names.size() ; i++) {
//			if(names.get(i).equals("양")) {
//				names.remove(i);
//			}
//		}
		
//		for(String name: names) {
//			System.out.println(name);
//		}
		
		//뒤에서부터 삭제할때
		for(int i =  names.size()-1 ; i >=0 ; i--) {
			if(names.get(i).equals("양")) {
				names.remove(i);
			}
		}

		for(String name: names) {
			System.out.println(name);
		}
	}

}
