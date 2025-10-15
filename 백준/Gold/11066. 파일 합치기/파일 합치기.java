

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int k = sc.nextInt();

            int[] arr = new int[k + 1];
            int[] sum = new int[k + 1];
            int[][] dp = new int[k + 1][k + 1];

            for (int i = 1; i <= k; i++) {
                arr[i] = sc.nextInt();
                sum[i] = sum[i - 1] + arr[i];
            }

            for (int len = 2; len <= k; len++) {
                for (int i = 1; i <= k - len + 1; i++) {
                    int j = i + len - 1;
                    dp[i][j] = Integer.MAX_VALUE;

                    for (int mid = i; mid < j; mid++) {
                        dp[i][j] = Math.min(dp[i][j],
                                dp[i][mid] + dp[mid + 1][j] + sum[j] - sum[i - 1]);
                    }
                }
            }

            System.out.println(dp[1][k]);
        }
    }
}
