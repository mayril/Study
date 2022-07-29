import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputTest {
	//파일에다 내가 원하는 바이트를 쓸수 있다
	public static void main(String[] args) {
		//1. try resource구문으로 내가 원하는 파일로 연결된 스트림을 생성하자
		//2. 적절한 catch 구문을 추가(이클립스 자동완성하면 필요한 catch 작성됨)
		try(FileOutputStream fo=new FileOutputStream("내가 원하는 파일")) {
			//3. 쓴디
			//3-1.1바이트 쓰는 법 fi.write(1바이트(정수))
			//3.2.n바이트 쓰는법 byte[] buf=new byte[n]; fi.write(buf)
			//3.3 n바이트 배열중 len만큼 쓰는법
			//	byte[] buf=new byte[n]; fi.write(buf,0,len);
			byte[] buf=new byte[1024*8];
			int len=1000;
			fo.write(buf, 0, len);
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
