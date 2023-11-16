import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
	static int[] stocks;

	public static void main(String args[]) throws Exception {
		System.setIn(new FileInputStream("./sw1859/input1859.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;


		for (int test_case = 1; test_case <= T; test_case++) {

			long profit = 0;
			int MAX_COST;

			int stockNum = Integer.parseInt(br.readLine());
			stocks = new int[stockNum];
			st = new StringTokenizer(br.readLine(), " ");

			for (int i = 0; i < stockNum; i++) {
				stocks[i] = Integer.parseInt(st.nextToken());
			}
			MAX_COST = stocks[stockNum - 1];

			for (int day = stocks.length - 1; day >= 0; day--) {

				if (MAX_COST < stocks[day]) {
					MAX_COST = stocks[day];
				} else {
					profit += MAX_COST - stocks[day];
				}
			}

			System.out.printf("#%d %d\n", test_case, profit);

		}

		br.close();

	}


}