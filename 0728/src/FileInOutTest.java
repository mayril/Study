
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOutTest{
	public static void main(String[] args) {
		byte key=33;
		try (FileOutputStream fo = new FileOutputStream("dd4.jpg"); 
				FileInputStream fi = new FileInputStream("dd3.jpg")) {
			//1.write(int) :1바이트를 스트림에 출력
			//2.write(byte[]) : byte배열 내용을 스트림에 출력
			//3.write(byte[],offset,size) : byte배열 내용을 offset만큼 건너뛰고 size
			//fo.write(254);
			//fo.flush;
			byte[] buf=new byte[1024 *32];
			int len=0;
			
			while ((len =fi.read(buf))!=-1) {
				for (int i = 0; i < len; i++) {
					buf[i]^=key;
				}
				fo.write(buf,0,len);
				fo.flush();
				
			}

			//1.read(int) :1바이트를 읽고 읽은 바이트를 반환(정수),읽을게 없음-1
			//2.read(byte[]) : byte배열 크기만큼을 읽어서  byte배열에 쓰고, 읽은길이를 반환
			//3.read(byte[],offset,len) : offset만큼 건너뛰고 len만큼 읽어서 byte배열에 채움
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}












