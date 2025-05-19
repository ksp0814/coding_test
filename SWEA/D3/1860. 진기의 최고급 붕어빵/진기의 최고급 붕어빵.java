
import java.util.*;
import java.io.*;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            
            int[] list = new int[n];
            int[] dp = new int[11111];
            
            for (int i =0; i < n; i++) {
            	list[i] = sc.nextInt();
            }
            Arrays.sort(list);
            
            for(int i =m; i < 11111; i += m ){
            	dp[i] = k;
            }
            
            boolean check = true;
            
            for(int i =0; i < n; i++) {
             	int time = list[i];
                int bread = (time / m) * k;
                
                if( bread < i+1) {
                	check = false;
                    break;
                }
             
            }
            
            if(check) {
            System.out.println("#" +test_case + " Possible");
            } else System.out.println("#" + test_case + " Impossible" );
	}
}
}