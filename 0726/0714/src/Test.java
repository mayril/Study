import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		//사용자의 입력을 받기 위한 초기작업
		Scanner sc = new Scanner(System.in);
//		주석은 프로그램 실행 시 무시됩니다.
//		System.out.println("Hello World");
//		System.out.println("Welcome to Hello");
//		int num;
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		num = a + b;
//		같은 타입의 데이터끼리의 연산은 해당 타입이 나온다..
//		/은 우리가 알고있던 나누기가 아니라, 몫을 구하기
//		%는 나머지를 구하기
//		이것은 정수 3 
//		이것은 실수 3 -> 3.0 3f
		
//		1. 섭씨온도를 입력받아서 화씨로 출력하기
//		2. 나이를 입력받아서 2n세이시군요 이렇게 출력하기
		
//		double f_num = 10 / 3.0;
////		num = a % b;
//		System.out.println(f_num);
		
		
//		+ - * / % 은 산술연산자로써, 두개의 숫자를 연산하고
//		결과도 숫자
		
//		== != > < >= <= 은 비교연산자로써, 두개의 숫자를 비교하고
//		결과는 진리값( true / false )
//		System.out.println( 11 >= 11 );
		
//		&& || 는 논리연산자로써, 두개의 진리값을 연산하여
//		결과는 진리값( true / false )
		
//		3 < x < 7 ?
//		int x = 2;	
//		System.out.println( x > 3 && x < 7 );
		
//		어떤수가 3의배수인가?
//		int x = 37;
//		System.out.println( x % 3 == 0 );
		
//		int n = sc.nextInt();
//		if( n > 19 ) {
//			System.out.println("성인입니다.");
//			System.out.println("담배주세요.");
//		}
//		else if( n > 12 )
//			System.out.println("그래도 12살은 넘어..");
//		else
//			System.out.println("성인아니네");
//		System.out.println("프로그램 종료");
		
//		조건문은 조건을 만나면..
//		조건의 진리 여부를 판단해서 만족하면 수행하고 가고
//		아니면 그냥 간다..
//		
//		반복문은 조건을 만나면..
//		조건의 진리 여부를 판단해서 만족하면 수행하고.
//		여전히 조건이 만족한지 또 보고 또 만족하면 또 수행..을 반복
//		아니면 그냥 간다..
		
//		int n = 5;
//		while( n < 10 ) {
//			System.out.println("10보다 작아요");
////			n = n + 1;
//			n++;
//		}
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
	}
}
