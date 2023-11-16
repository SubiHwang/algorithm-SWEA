import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {

	static int arr[] = new int[10];

	public static void main(String args[]) throws Exception {

		System.setIn(new FileInputStream("./sw2072/input2072.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;

		for (int test_case = 1; test_case <= T; test_case++) {
			st = new StringTokenizer(br.readLine(), " ");

			int result = 0;

			for (int i = 0; i < 10; i++) {

				int temp;
				temp = Integer.parseInt(st.nextToken());

				if (temp != 0) {
					if (temp % 2 != 0) {
						result += temp;
					}
				}

			}


			System.out.printf("#%d %d\n", test_case, result);

		}

		br.close();

	}


}