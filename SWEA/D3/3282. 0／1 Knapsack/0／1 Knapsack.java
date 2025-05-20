import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt(); // 물건 개수
            int K = sc.nextInt(); // 가방 용량

            int[] weights = new int[N];
            int[] values = new int[N];

            for (int i = 0; i < N; i++) {
                weights[i] = sc.nextInt();
                values[i] = sc.nextInt();
            }

            int[][] dp = new int[N + 1][K + 1];

            for (int i = 1; i <= N; i++) {
                int weight = weights[i - 1];
                int value = values[i - 1];

                for (int w = 0; w <= K; w++) {
                    if (w >= weight) {
                        // 현재 물건을 넣을 수 있는 경우
                        dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - weight] + value);
                    } else {
                        // 현재 물건을 넣을 수 없는 경우
                        dp[i][w] = dp[i - 1][w];
                    }
                }
            }

            System.out.println("#" + test_case + " " + dp[N][K]);
        }
    }
}
