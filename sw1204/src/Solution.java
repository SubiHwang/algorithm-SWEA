import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

//	static int cache[] = new int[101];

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("./sw1204/input1204.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;

		for (int test_case = 1; test_case <= T; test_case++) {

			int test = Integer.parseInt(br.readLine());

			int cache[] = new int[101];

			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				int score = Integer.parseInt(st.nextToken());
				cache[score] += 1;
			}

			int MAX_SCORE = 0;
			int result = 0;

			for (int i = 0; i < cache.length; i++) {
				if (cache[i] >= MAX_SCORE) {
					MAX_SCORE = cache[i];
					result = i;
				}
			}

			System.out.printf("#%d %d\n", test, result);

		}


	}

}