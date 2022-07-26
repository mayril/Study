import java.util.Scanner;

public class 사과나무영양분구하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][N];
		//N번에 걸쳐서 행의 입력 된다..
		for(int i = 0; i < N; i++) {
			//각 행마다 N개의 정수가 입력됨.
			for(int j = 0; j < N; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int max = 0;
		//모든 칸에 대해서 자신+상+하+좌+우 의 합을 계산해보기
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				//이 자리에서 arr[i][j] 에 대해 자신+상+하+좌+우를 구하면 됨
				//델타를 사용하지 않고 그냥 더해보기
				int sum = arr[i][j]; //내 양분
				if(i-1 >= 0)
					sum += arr[i-1][j]; //위에 양분
				if(i+1 < N)
					sum += arr[i+1][j]; //아래 양분
				if(j-1 >= 0)
					sum += arr[i][j-1]; //왼쪽 양분
				if(j+1 < N)
					sum += arr[i][j+1]; //오른쪽 양분
				
				if( max < sum )
					max = sum;
			}
		}
		System.out.println(max);
	}
}









