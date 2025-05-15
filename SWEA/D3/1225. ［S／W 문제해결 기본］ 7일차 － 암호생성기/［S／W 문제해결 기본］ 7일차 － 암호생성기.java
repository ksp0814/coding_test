
import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);


		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int N = sc.nextInt();
            
            List<Integer> list = new ArrayList<>();
            
            for(int i =0; i < 8; i++) {
            	list.add(sc.nextInt());
            }
            
            int minus = 1;
            while(true) {
                
                int num = list.remove(0) - minus;
                if(num <= 0) {
                	list.add(0);
                    break;
                } else {
                	list.add(num);
                }
                minus++;
                
                if(minus >5) {
                	minus = 1;
                }
            }
                
                System.out.print("#" + test_case + " ");
                
                for(int i = 0; i < 8; i++) {
                	System.out.print(list.get(i)+ " ");
                }
            System.out.println();
                
		}
	}
}