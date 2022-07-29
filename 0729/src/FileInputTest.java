import java.io.FileInputStream;

public class FileInputTest {
	//파일에서 바이트를 읽을수 있다
	public static void main(String[] args) {
		//1. try resource구문으로 내가 원하는 파일로 연결된 스트림을 생성하자
		//2. 적절한 catch 구문을 추가(이클립스 자동완성하면 필요한 catch 작성됨)
		try (FileInputStream fi=new FileInputStream("내가 원하는 파일")){
			//3. 읽는다
			//3-1.1바이트 읽는 법 fi.read()
			//3.2.n바이트 읽는법 byte[] buf=new byte[n]; fi.read(buf)
			//3.3 읽을게 없으면 -1 나오는거 아니깐 while루프에 활용함
			
			byte[] buf =new byte[1024*8];
			int len=0;
			while ((len=fi.read(buf))!=-1) {
				
				//읽은 내용은 buf에 있으니 활용
			}
		} catch (Exception e) {
		
		}

	}

}
