import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws Exception {
		//  System.setIn(new FileInputStream("./sw2063/input2063.txt"));

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		int arr[] = new int[T];
		int middle = T / 2;

		StringTokenizer st;
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < T; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arr);

		System.out.println(arr[middle]);

	}
}