import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class PersonReadTest {
	//파일로부터Person객체를 읽는다
	public static void main(String[] args) {
		// 1. try resource 구문에서 빨대를 생성한다.(Object-File연결된 이중빨대
		try(ObjectInputStream oi=new ObjectInputStream(new FileInputStream("Person.dat"))) {
			//Person person=(Person) oi.readObject();
			//System.out.println(person);
			
			List<Person> list=(List<Person>) oi.readObject();
			for(Person p:list) {
				System.out.println(p);
			}
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		}catch (IOException e) {
			// TODO: handle exception
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
		}
	}

}
