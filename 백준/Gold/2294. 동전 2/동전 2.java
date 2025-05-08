

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] coin = new int[n];
        int[] dp = new int[k+1];
        Arrays.fill(dp, 10001);
        dp[0] = 0;

        for (int i =0; i < n; i++) {
            coin[i] = sc.nextInt();
        }

        for (int i =0; i < n; i++) {
            for (int j = coin[i]; j <= k; j++) {
                dp[j] = Math.min(dp[j], dp[j-coin[i]]+1);
            }
        }

        if(dp[k] == 10001) {
            System.out.println(-1);
        } else {
            System.out.println(dp[k]);
        }

    }
}
