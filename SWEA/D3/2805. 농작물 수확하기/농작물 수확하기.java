
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
			int n = sc.nextInt();
            sc.nextLine();
            
            int[][] list= new int[n][n];
            
            for(int i = 0; i<n; i++) {
            	String s = sc.nextLine();
                for(int j=0; j<n;j++) {
                	list[i][j] = s.charAt(j) - '0';
                }
            }
            
            int ans = 0;
            
            for(int i = 0; i < n ; i++) {
            	int start = Math.abs(n/2 -i);
                int end = n - start;
                
                for(int j = start; j< end; j++){
                	ans += list[i][j];
                }
            }
            System.out.println("#" + test_case+ " " + ans);
        }
	}
}