import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class PersonWriteTest {

	public static void main(String[] args) {
		//Person클래스로 만든 객체를 파일에 저장한다
		//1. Person을 Serializable 하도록 낙인 찍기
		//2. try resource구문에서 빨대 생성.(이것은 Object File로 연결된 2중빨대
		
		try(ObjectOutputStream oo=new ObjectOutputStream(new FileOutputStream("person.dat"))) {
			//3. 쓴다
			List<Person> list=new ArrayList<Person>();
			//Person p=new Person("Hong", 27);
			list.add(new Person("hong", 27));
			list.add(new Person("kim", 27));
			list.add(new Person("hong", 27));
			oo.writeObject(list);
			oo.flush();
		} catch (FileNotFoundException e) {
			// TODO: handle exception
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
