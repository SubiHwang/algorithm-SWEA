import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Solution {

	static String[] score = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D"};

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("./sw1983/input1983.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;

		for (int test_case = 1; test_case <= T; test_case++) {
			st = new StringTokenizer(br.readLine());
			int allNum = Integer.parseInt(st.nextToken());
			int studentNum = Integer.parseInt(st.nextToken());
			List<Double> grade = new ArrayList<>();
			double studentScore = 0.0;

			for (int i = 0; i < allNum; i++) {
				st = new StringTokenizer(br.readLine());
				double midterm = Integer.parseInt(st.nextToken());
				double finals = Integer.parseInt(st.nextToken());
				double project = Integer.parseInt(st.nextToken());
				double sum = midterm * 0.35 + finals * 0.45 + project * 0.2;
				grade.add(sum);
				if (i + 1 == studentNum) studentScore = grade.get(i);
			}

			Collections.sort(grade, Collections.reverseOrder());

			int index = 0;
			for (int i = 0; i < grade.size(); i++) {
				if (grade.get(i) == studentScore) {
					index = i;
				}
			}

			index = index / (allNum / 10);

			System.out.printf("#%d %s\n", test_case, score[index]);


		}

	}
}