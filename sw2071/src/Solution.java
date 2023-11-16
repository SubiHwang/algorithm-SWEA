import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("./sw2071/input2071.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;

		int arr[] = new int[10];

		for (int test_case = 1; test_case <= T; test_case++) {

			int amount = 0;
			st = new StringTokenizer(br.readLine());

			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
				amount += arr[i];
			}
			double avg = amount / 10.0;
			// double avg = amount / 10; 주의

			System.out.printf("#%d %.0f\n", test_case, avg);
			//System.out.printf("#%d %d\n", test_case, Math.round(avg)); 가능

		}
	}
}