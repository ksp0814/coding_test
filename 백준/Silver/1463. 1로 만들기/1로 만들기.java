import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        // 연산을 하는 최솟값을 구해
        int[] dp = new int[1000001];
        dp[2] = 1;
        dp[3] = 1;

        for (int i =4; i <=N; i++) {
            int count = dp[i-1] +1;
            if (i % 3 ==0 ){
                count = Math.min(count, dp[i/3] +1);
            }
            if (i % 2 == 0) {
                count = Math.min(count, dp[i/2] +1);
            }
            dp[i] = count;
        }
        System.out.println(dp[N]);

    }
}
