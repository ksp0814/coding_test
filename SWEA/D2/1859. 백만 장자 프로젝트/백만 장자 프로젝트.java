
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
            int size = sc.nextInt();
            long[] list = new long[size];
            for (int i =0; i<size; i++) {
            	list[i] = sc.nextLong();
            }
            
            long res = 0;
            long max = 0;
            for(int i = size-1; i >= 0; i--){
            	if(list[i] >max){
                	max = list[i];
                } else {res += max- list[i];}
            }
            System.out.println("#" + test_case + " " + res);
		}
	}
}