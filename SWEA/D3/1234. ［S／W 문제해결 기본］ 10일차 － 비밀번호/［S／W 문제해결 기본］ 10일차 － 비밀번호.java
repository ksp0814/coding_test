
import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);


		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int N =sc.nextInt();
            
            Stack<Character> list = new Stack<>();
            
            String s = sc.next();
           
            
            for(int i =0; i < N; i++) {
               char c = s.charAt(i);
               if( !list.empty() && list.peek() == c) { // list가 비어잇지 않고, c가 list에 마지막 값과 같다면 리스트에 마지막 값을 지운다.
                   list.pop();
               } else list.push(c); // 아니라면 리스트에 c를 추가한다.
            }
            System.out.print("#" + test_case + " ");
            
            for(int i =0; i < list.size(); i++){
            	System.out.print(list.get(i));
            }
            System.out.println();
		}
	}
}