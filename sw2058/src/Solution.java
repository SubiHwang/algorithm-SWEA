import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception {
		//System.setIn(new FileInputStream("./sw2001/input2001.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = String.valueOf(n);

		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			result += Integer.parseInt(String.valueOf(s.charAt(i)));
		}
		System.out.println(result);
	}
}