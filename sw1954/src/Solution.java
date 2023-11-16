import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {

	static int snail[][];

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("./sw1954/input1954.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int test_case = 1; test_case <= T; test_case++) {
			int num = Integer.parseInt(br.readLine());
			snail = new int[num][num];
			//순서: 오하좌상
			int dx[] = {0, 1, 0, -1}, dy[] = {1, 0, -1, 0};
			//, dd[] = {0, 1, 2, 3};
			int n = 1, x = 0, y = 0, d = 0;

			while (n <= num * num) {
				int X = x + dx[d], Y = y + dy[d];
				if (X < 0 || X >= num || Y < 0 || Y >= num || snail[X][Y] != 0) {
					d = (d + 1) % 4;
					X = x + dx[d];
					Y = y + dy[d];
				}
				snail[x][y] = n++;
				x = X;
				y = Y;
			}

			System.out.printf("#%d\n", test_case);
			for (int i = 0; i < num; i++) {
				for (int j = 0; j < num; j++) {
					System.out.printf("%d ", snail[i][j]);
				}
				System.out.println();
			}

		}

	}
}