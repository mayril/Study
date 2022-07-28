package com.ssafy.json;

import java.util.HashMap;
import java.util.Map;

//import com.google.gson.Gson;

//라이브러리 인식하기
// 방법1. JRE System Library에 끼워넣어버리기(JDK폴더의 lib에 넣으면됨)
// 방법2. 외부에 존재하는 jar파일을 인식시켜주기
//	(프로젝트가 다른 환경으로 이사가면.. 인식이 안될수있음)
// 방법3.(추천) 프로젝트 내부에 jar를 복사해두고 인식시켜주기
/*// 방법4.(SSAF강추_추후에..) 라이브러리(Maven) 관리 툴을 이용
public class ObjToJsonTest {
	static class Message {
		private String sendId;
		private String recvId;

		public Message(String sendId, String recvId) {
			this.sendId = sendId;
			this.recvId = recvId;
		}
	}

	public static void main(String[] args) {
		Message msg = new Message("Hong", "Kim");
		Gson gson = new Gson();
		String jsonMsg = gson.toJson(msg);
		System.out.println(jsonMsg);

		Message msg2 = gson.fromJson(jsonMsg, Message.class);
		System.out.println(msg2.sendId + ", " + msg2.recvId);

		Map<String, Object> map = new HashMap<>();
		map.put("id", "a");
		map.put("age", 100);
		String result = gson.toJson(map);
		System.out.println(result);

		Map<String, Object> map2 = gson.fromJson(result, Map.class);
		System.out.println(map2);

	}
}
*/