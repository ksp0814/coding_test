
import java.util.*;
import java.io.*;

public class Main {
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        dp = new int[n+1];

        System.out.println(check(n));

    }

    static int check(int n) {
        if (n == 0) return 0;

        if (n == 1) return 1;

        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i]= dp[i-2] + dp[i-1];
        }
        return dp[n];
    }
}
