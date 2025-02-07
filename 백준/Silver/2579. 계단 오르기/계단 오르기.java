
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static Integer[] dp;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        arr = new int[n + 1];  // 계단 점수 배열 (1번 계단부터 사용)
        dp = new Integer[n + 1];  // DP 배열 (1번 계단부터 사용)

        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 예외 처리: 계단이 1개만 있는 경우
        if (n == 1) {
            System.out.println(arr[1]);
            return;
        }

        // 기저 사례 (초기 값)
        dp[1] = arr[1];  // 첫 번째 계단의 점수
        if (n >= 2) dp[2] = arr[1] + arr[2];  // 두 번째 계단까지 점수

        System.out.println(check(n));
    }

    static int check(int n) {
        if (n<= 0) return 0;
        if (dp[n] == null) {  // 아직 계산되지 않았다면
            dp[n] = Math.max(check(n - 2), check(n - 3) + arr[n - 1]) + arr[n];
        }
        return dp[n];
    }
}

