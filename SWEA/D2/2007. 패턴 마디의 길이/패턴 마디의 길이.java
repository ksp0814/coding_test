
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
			String s = sc.next();
            
            int ans =0;
            for(int i = 1; i <= 10; i++) {
            	String one = s.substring(0,i);
                String two = s.substring(i,i+i);
                if( one.equals(two)) {
                	ans = one.length();
                    break;
                }
            }
            
            System.out.println("#" + test_case + " " + ans);
		}
	}
}