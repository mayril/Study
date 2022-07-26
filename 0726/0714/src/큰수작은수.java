import java.util.Scanner;

public class 큰수작은수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		//a가 b보다 크다면 a-b
		if( a > b )
			System.out.println(a-b);
		//아니라면 b-a
		else
			System.out.println(b-a);
	}
}
