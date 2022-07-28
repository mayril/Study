package com.ssafy.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		//list가 index로 데이터를 식별한다면,
		//map은 Key로 데이터를 식별한다.
		Map<String, String> map = new HashMap<>();
		map.put("Hong", "010-2602-7091");
		map.put("Kim", "010-2222-2222");
		map.put("Lee", "010-2222-2222");
		
		System.out.println(map);
		System.out.println(map.get("Kim"));
		
		System.out.println(map.get("ty"));
		
		System.out.println(map.containsKey("Lee"));
		
		
	}
}
