import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
			int M = sc.nextInt();

			char[][] list = new char[N][M];

			for (int i = 0; i < N; i++) {
				String s = sc.next();
				for (int j = 0; j < M; j++) {
					list[i][j] = s.charAt(j);
				}
			}

			List<Integer> ans = new ArrayList<>();

			outer:
			for (int i = 0; i < N; i++) {
				int end = -1;

				// 오른쪽에서 1 찾기
				for (int j = M - 1; j >= 0; j--) {
					if (list[i][j] == '1') {
						end = j;
						break;
					}
				}
				if (end == -1) continue;

				int start = end - 56 + 1;
				if (start < 0) continue;

				ans.clear();

				for (int j = start; j <= end; j += 7) {
					String s = "";
					for (int k = j; k < j + 7; k++) {
						s += list[i][k];
					}

					if (s.equals("0001101")) ans.add(0);
					else if (s.equals("0011001")) ans.add(1);
					else if (s.equals("0010011")) ans.add(2);
					else if (s.equals("0111101")) ans.add(3);
					else if (s.equals("0100011")) ans.add(4);
					else if (s.equals("0110001")) ans.add(5);
					else if (s.equals("0101111")) ans.add(6);
					else if (s.equals("0111011")) ans.add(7);
					else if (s.equals("0110111")) ans.add(8);
					else if (s.equals("0001011")) ans.add(9);
					else {
						ans.clear();
						break;
					}
				}

				if (ans.size() == 8) break outer;
			}

			int result = 0;

			if (ans.size() == 8) {
				int l = 0, r = 0;

				for (int i = 0; i < 8; i++) {
					if ((i + 1) % 2 == 0) r += ans.get(i);
					else l += ans.get(i);
				}

				int res = (l * 3) + r;

				if (res % 10 == 0) result = l + r;
			}

			System.out.println("#" + test_case + " " + result);
		}
	}
}
