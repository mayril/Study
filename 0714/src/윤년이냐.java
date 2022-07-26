import java.util.Scanner;

public class 윤년이냐 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("연도 : ");
		int year = sc.nextInt();
//		4로 나누어 떨어지는 해는 윤년으로 한다. ...
//		4, 100으로 나누어 떨어지는 해는 평년으로 한다. ...
//		400으로 나누어 떨어지는 해는 윤년으로 둔다.
//		
//		4로 나눠떨어지는 것 && year % 100 != 0 윤년
//		400으로 나눠떨어지면 무족권 윤년
//		boolean isDivide4 = (year % 4 == 0);
//		boolean isLeap = isDivide4 && (year % 100 != 0);
//		isLeap = isLeap || (year % 400 == 0 );
//		System.out.println(isLeap);
		
		System.out.println( ((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0  );
	}
}