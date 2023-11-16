import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int T;
		T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a < b) System.out.printf("#%d %s\n", test_case, "<");
			if (a == b) System.out.printf("#%d %s\n", test_case, "=");
			if (a > b) System.out.printf("#%d %s\n", test_case, ">");
		}
	}
}