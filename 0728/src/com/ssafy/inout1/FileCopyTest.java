package com.ssafy.inout1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {
	public static void main(String[] args) {
		String path = "C:\\Users\\yang\\Desktop\\";
		String originFile = path +  "123.txt";//얘를 대상으로 InputStream
		String destFile = path + "123복사본.txt"; //얘를 대상으로 OutputStream
		
		try(FileOutputStream fo = new FileOutputStream(destFile);
				FileInputStream fi = new FileInputStream(originFile)){
			
			byte[] buf = new byte[1024];
			int size = 0;
			while( (size = fi.read(buf)) > 0 ) {
				fo.write(buf, 0, size);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
