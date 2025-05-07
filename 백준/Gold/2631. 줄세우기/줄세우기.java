
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] dp = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            dp[i] = 1;
            for (int j=0; j < i; j++) {
                if (arr[j]<arr[i] && dp[j]+1 > dp[i]) {
                    dp[i] = dp[j]+1;
                    count = Math.max(count, dp[i]);
                }
            }
        }

        System.out.println(N-count);
    }
}
