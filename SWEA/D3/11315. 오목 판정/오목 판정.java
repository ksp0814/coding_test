
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = sc.nextInt();
            char[][] board = new char[n][n];

            // 입력 처리
            for (int i = 0; i < n; i++) {
                String line = sc.next();
                for (int j = 0; j < n; j++) {
                    board[i][j] = line.charAt(j);
                }
            }

            boolean found = false;

            // 모든 칸에 대해 검사
            for (int i = 0; i < n && !found; i++) {
                for (int j = 0; j < n && !found; j++) {
                    if (board[i][j] == 'o') {
                        
                        if (j + 4 < n) {
                            boolean ok = true;
                            for (int k = 0; k < 5; k++) {
                                if (board[i][j + k] != 'o') {
                                    ok = false;
                                    break;
                                }
                            }
                            if (ok) found = true;
                        }

                        
                        if (i + 4 < n) {
                            boolean ok = true;
                            for (int k = 0; k < 5; k++) {
                                if (board[i + k][j] != 'o') {
                                    ok = false;
                                    break;
                                }
                            }
                            if (ok) found = true;
                        }

                        
                        if (i + 4 < n && j + 4 < n) {
                            boolean ok = true;
                            for (int k = 0; k < 5; k++) {
                                if (board[i + k][j + k] != 'o') {
                                    ok = false;
                                    break;
                                }
                            }
                            if (ok) found = true;
                        }

                       
                        if (i + 4 < n && j - 4 >= 0) {
                            boolean ok = true;
                            for (int k = 0; k < 5; k++) {
                                if (board[i + k][j - k] != 'o') {
                                    ok = false;
                                    break;
                                }
                            }
                            if (ok) found = true;
                        }
                    }
                }
            }

            System.out.println("#" + test_case + " " + (found ? "YES" : "NO"));
        }
	}
}