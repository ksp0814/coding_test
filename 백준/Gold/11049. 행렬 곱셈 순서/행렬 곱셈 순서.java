
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][2];
        int[][] dp = new int[n][n];


        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j + i - 1 < n; j++) {
                dp[j][j + i - 1] = Integer.MAX_VALUE;
                for (int k = j; k < j + i - 1; k++) {
                    dp[j][j + i - 1] = Math.min(dp[j][j + i - 1], dp[j][k] + dp[k + 1][j + i - 1] + arr[j][0] * arr[k][1] * arr[j + i - 1][1]);
                }
            }
        }
        System.out.println(dp[0][n - 1]);
    }
}

