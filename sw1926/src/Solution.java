import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("./sw1926/input1926.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int i = 1; i <= T; i++) {
			String temp = String.valueOf(i);
			if (temp.contains("3") || temp.contains("6") || temp.contains("9")) {
				for (int j = 0; j < temp.length(); j++) {
					if (temp.charAt(j) == '3' || temp.charAt(j) == '6' || temp.charAt(j) == '9') {
						System.out.print("-");
					}
				}
				System.out.print(" ");
			} else {
				System.out.printf("%s ", temp);
			}
		}

	}
}