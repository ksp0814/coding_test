
import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);


		for(int test_case = 1; test_case <= 10; test_case++)
		{
            int n = sc.nextInt();
            
            int[] list = new int[n];
            
            for (int i = 0; i < n; i++) {
            	list[i] = sc.nextInt();
            }
            
            int ans = 0;
            
            for(int i =2; i < n-2; i++ ){
            	int left = Math.max(list[i-2],list[i-1]);
                int right = Math.max(list[i+1],list[i+2]);
                int big = Math.max(left,right);
                
                if( list[i] > left && list[i] > right) {
                	ans += list[i] - big;
                }
            }
            
            System.out.println("#" + test_case + " " + ans);
		
		}
	}
}