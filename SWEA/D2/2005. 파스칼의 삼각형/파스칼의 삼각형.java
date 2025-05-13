
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
			System.out.println("#" +test_case);
            
            int N = sc.nextInt();
            
            int[][] list = new int[N][N];
            
            list[0][0]  =1;
            
            for(int i = 1; i < N; i++) {
            	list[i][0] = 1;
                list[i][i] = 1;
            }
            
            for(int i = 2; i < N; i++) {
            	for(int j = 1; j<i; j++){
                	list[i][j] = list[i-1][j-1] + list[i-1][j];
                }
            }
            for(int i =0; i<N; i++) {
            	for(int j =0; j<=i; j++) {
                    	System.out.print(list[i][j]+ " "); 
                }
                System.out.println();
            }
		}
	}
}