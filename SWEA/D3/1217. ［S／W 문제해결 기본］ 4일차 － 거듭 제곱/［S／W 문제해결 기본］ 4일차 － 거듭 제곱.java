
import java.util.Scanner;

class Solution
{
    static int x,y;
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int T = sc.nextInt();
            
            x = sc.nextInt();
            y = sc.nextInt();
            
            int res = check(0,x);

            System.out.println("#" +T+ " " + res);
		}
	}
    static int check(int depth, int sum) {
    	if (depth == y-1) {
        	return sum;
        }
        
        return check(depth+1, sum*x);
    }
}