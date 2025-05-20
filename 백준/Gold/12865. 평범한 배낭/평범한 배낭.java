
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // 물품의 수
        int K = sc.nextInt(); // 무게

        int[][] list = new int[N][2];

        for (int i =0; i< N; i++) {
            list[i][0] = sc.nextInt();
            list[i][1] = sc.nextInt();
        }

        int[][] dp = new int[N+1][K+1];

        for(int i = 1; i <= N; i++) {
            int weight = list[i-1][0];
            int value = list[i-1][1];

            for(int j = 0; j <= K; j++) {
                if(j >= weight) {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j-weight] + value);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        System.out.println(dp[N][K]);

    }
}
