import java.io.*;

public class Main {
    static int[][] dp = new int[41][2];
    
    public static void main(String args[]) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    int test = Integer.parseInt(br.readLine());
    
    StringBuilder sb = new StringBuilder();
    
    dp[0][0] = 1;
    dp[0][1] = 0;
    dp[1][0] = 0;
    dp[1][1] = 1;
    
    for(int i =2; i < 41; i++) {
        dp[i][0] = dp[i-1][0] + dp[i-2][0];
        dp[i][1] = dp[i-1][1] + dp[i-2][1];
    }
    
    for(int i = 0; i<test; i++) {
        int t = Integer.parseInt(br.readLine());
        System.out.println(dp[t][0] + " " + dp[t][1]);
    }
    }
}