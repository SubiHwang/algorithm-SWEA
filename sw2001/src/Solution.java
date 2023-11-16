import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws Exception {
		//System.setIn(new FileInputStream("./sw2001/input2001.txt"));

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int arr[][] = new int[N][N];

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			int ans = 0;
			for (int i = 0; i <= N - M; i++) {
				for (int j = 0; j <= N - M; j++) {
					int sum = 0;
					for (int m = i; m < i + M; m++) {
						for (int n = j; n < j + M; n++) {
							sum += arr[m][n];
						}
					}
					ans = Math.max(ans, sum);
				}
			}
			System.out.printf("#%d %d\n", test_case, ans);
		}

	}
}