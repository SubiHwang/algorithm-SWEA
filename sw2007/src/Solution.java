import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("./sw2007/input2007.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int test_case = 1; test_case <= T; test_case++) {
			String s = br.readLine();
			for (int i = 1; i <= s.length(); i++) {
				String a = s.substring(0, i);
				String b = s.substring(i, i + i);
				if (a.equals(b)) {
					System.out.printf("#%d %d\n", test_case, a.length());
					break;
				}
			}
		}

	}
}