
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <= 10; test_case++)
		{
            int T = sc.nextInt();
            
			String s = sc.next();
            String line = sc.next();
            
            int s_len = s.length(); // 찾고자 하는 단어의 길이
            int line_len = line.length(); // 입력받은 단어의 길이
            
            int ans = 0;
            
            for(int i = 0; i <= line_len-s_len; i++) {
            	String target = line.substring(i, i+s_len);
                if( target.equals(s)) {
                	ans++;
                }
            }
            
            System.out.println("#" + T + " " + ans);

		}
	}
}