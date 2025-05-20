
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();


		for(int test_case = 1; test_case <= T; test_case++)
		{
			int N = sc.nextInt();
            int L = sc.nextInt();
            
            int[][] list = new int[N][2];
            
            for(int i =0; i<N; i++) {
            	list[i][0] = sc.nextInt();
                list[i][1] = sc.nextInt();
            }
            
            int[][] dp = new int[N+1][L+1];
            
            for(int i =1; i <= N; i++) {
            	int score = list[i-1][0];
                int cal = list[i-1][1];
                
                for ( int k = 0; k <= L; k++) {
                	if(k >= cal) {
                    	dp[i][k] = Math.max(dp[i-1][k],dp[i-1][k-cal] + score);
                    } else {
                    	dp[i][k] = dp[i-1][k];
                    }
                }
            }
            
            System.out.println("#" +test_case + " " +dp[N][L]);
		}
	}
}