import java.io.File;

//C:\Users\multicampus\Downloads\대전 이인호\Study\0729\person.dat


//상대경로 : 현재위치로부터의 경로
//절대경로 : 맨 루트로부터의 경로
//정규경로 : 절대경로중에서 삽질 안하고 다이렉트로 꽂은 최단경로
public class FileTest {
	public static void main(String[] args) {
		File file=new File("src/../person.dat");
		System.out.println(file.getAbsolutePath());
	}
}
