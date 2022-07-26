import java.util.Scanner;

public class 사과나무영양분구하기_델타 {
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
		//미리 상하좌우에 대한 델타를 정의
		int[] dr = { -1, 1, 0, 0 };
		int[] dc = { 0, 0, -1, 1 };
		int max = 0;
		//모든 칸에 대해서 자신+상+하+좌+우 의 합을 계산해보기
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				int sum = arr[i][j];
				
				for(int d = 0; d < 4; d++) {
					int nr = i + dr[d];
					int nc = j + dc[d];
					//이번에 더하려는 좌표 nr,nc가 사각형 안에 있는지 확인
					if( nr >= 0 && nc >= 0 && nr < N && nc < N ) {
						sum += arr[nr][nc];
					}
				}
				if( max < sum )
					max = sum;
			}
		}
		System.out.println(max);
	}
}









