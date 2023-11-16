import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("./sw1979/input1979.txt"));

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int M = sc.nextInt();

			int[][] arr = new int[N][N];

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			int ans = 0;

			for (int i = 0; i < N; i++) {
				int temp = 0;
				for (int j = 0; j < N; j++) {
					if (arr[i][j] == 0) { //벽
						if (temp == M) {
							ans++; //벽 전에 M만큼 존재하면
						}
						temp = 0;
					} else {
						temp++;
					}
				}
				if (temp == M) { //끝났을 때 M만큼 존재하면
					ans++;
				}
			}

			for (int i = 0; i < N; i++) {
				int temp = 0;
				for (int j = 0; j < N; j++) {
					if (arr[j][i] == 0) {
						if (temp == M) {
							ans++;
						}
						temp = 0;
					} else {
						temp++;
					}
				}
				if (temp == M) {
					ans++;
				}
			}


			System.out.printf("#%d %d\n", test_case, ans);

		}
	}
}