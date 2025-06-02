import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[][] dp;
    static int[][] arr;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        arr = new int[n][3];
        dp = new int[n][3];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            String[] parts = line.split(" ");

            for (int j =0; j< parts.length; j++){
                arr[i][j] = Integer.parseInt(parts[j]);
            }
        }

        dp[0][0] = arr[0][0];
        dp[0][1] = arr[0][1];
        dp[0][2] = arr[0][2];

        int ans = Math.min(paint_cost(n-1,0),Math.min(paint_cost(n-1,1),paint_cost(n-1,2)));
        System.out.println(ans);

    }

    static int paint_cost(int n, int color) {
        if(dp[n][color] == 0) {
            if(color == 0) {
                dp[n][0] = Math.min(paint_cost(n-1,1), paint_cost(n-1,2)) + arr[n][0];
            }
            else if(color == 1) {
                dp[n][1] = Math.min(paint_cost(n-1,0), paint_cost(n-1,2)) + arr[n][1];
            } else {
                dp[n][2] = Math.min(paint_cost(n-1,0), paint_cost(n-1,1)) + arr[n][2];
            }
        }
        return dp[n][color];
    }
}
