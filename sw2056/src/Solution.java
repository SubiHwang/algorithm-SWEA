import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("./sw2056/input2056.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		int treuDay[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		for (int test_case = 1; test_case <= T; test_case++) {
			int all = Integer.parseInt(br.readLine());
			int year = all / 10000;
			int month = (all - year * 10000) / 100;
			int day = all % 100;

			if (month < 1 || month > 12 || day < 1 || day > treuDay[month - 1]) {
				System.out.printf("#%d -1\n", test_case);
			} else {
				System.out.printf("#%d %04d/%02d/%02d\n", test_case, year, month, day);
			}

		}

	}
}