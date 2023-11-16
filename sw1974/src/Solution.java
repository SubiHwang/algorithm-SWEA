import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("./sw1974/input1974.txt"));

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 1; test_case <= T; test_case++) {
			int[][] sudoku = new int[9][9];
			boolean check = true;

			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					sudoku[i][j] = sc.nextInt();
				}
			}
			for (int i = 0; i < 9; i++) {
				int[] arr = new int[10];

				for (int j = 0; j < 9; j++)
					arr[sudoku[i][j]]++;

				for (int k = 1; k <= 9; k++) {
					if (arr[k] == 0) {
						check = false;
						break;
					}
				}
			}

			for (int i = 0; i < 9; i++) {
				int[] arr = new int[10];

				for (int j = 0; j < 9; j++)
					arr[sudoku[j][i]]++;

				for (int k = 1; k <= 9; k++) {
					if (arr[k] == 0) {
						check = false;
						break;
					}
				}
			}

			for (int i = 0; i <= 6; i += 3) {
				for (int j = 0; j <= 6; j += 3) {
					int[] arr = new int[10];

					int a = i + 3;
					int b = j + 3;

					for (int x = i; x < a; x++) {
						for (int y = j; y < b; y++) {
							arr[sudoku[x][y]]++;
						}
					}

					for (int z = 1; z <= 9; z++) {
						if (arr[z] == 0) {
							check = false;
							break;
						}
					}
				}
			}

			int result = check ? 1 : 0;

			System.out.println("#" + test_case + " " + result);
		}
	}
}