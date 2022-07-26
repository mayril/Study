import java.util.Scanner;

public class 나이2n세 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 : ");
		int age = sc.nextInt();
		int n = age / 10;
		System.out.println("당신은 " + n + "n세 이시군요");
	}
}