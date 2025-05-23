
import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);


		for(int test_case = 1; test_case <= 10; test_case++)
		{
		
            int T = sc.nextInt();
            
            List<Integer> list = new ArrayList<>();
            
            String s = sc.next();
            
            list.add(s.charAt(0) - '0');
           
            int x = 0;
            for(int i =1; i < T; i++) {
            	if( x >= 0 && list.get(x) == s.charAt(i) -'0') {
                	list.remove(x);
                    x--;
                } else {
                	list.add(s.charAt(i) -'0');
                    x++;
                }
            }
            
            System.out.print("#" + test_case +" ");
            
            for(int i =0; i < list.size(); i++) {
            	System.out.print(list.get(i));
            }
            
            System.out.println();
            

		}
	}
}