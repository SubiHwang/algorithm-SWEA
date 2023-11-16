import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Base64;

public class Solution {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("./sw1928/input1928.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int test_case = 1; test_case <= T; test_case++) {
			String str = br.readLine();
			String result = new String(Base64.getDecoder().decode(str));
			System.out.println("#" + test_case + " " + result);

		}
	}
}