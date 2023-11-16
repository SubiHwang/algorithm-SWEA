import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws Exception {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;

		int n[] = new int[10];

		for (int test_case = 1; test_case <= T; test_case++) {
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 10; i++) {
				n[i] = Integer.parseInt(st.nextToken());
			}

			int MAX = 0;
			for (int i = 0; i < 10; i++) {
				if (n[i] >= MAX) {
					MAX = n[i];
				}
			}
			System.out.printf("#%d %d\n", test_case, MAX);
		}
	}
}