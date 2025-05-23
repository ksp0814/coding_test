
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
            
            for(int i = 0; i <N; i++) {
            	list.add(sc.nextInt());
            }
            
            int M = sc.nextInt();
            sc.nextLine();
            
            String input = sc.nextLine();
            
            String[] parts = input.split("I");
            List<String> com = new ArrayList<>();
            
            for(String s : parts){
            	s = s.trim();
                if(!s.isEmpty()) {
                	com.add(s);
                }
            }
            
            for( String cmd : com) {
            	String[] token = cmd.split(" ");
                
                int x = Integer.parseInt(token[0]); // 어디에 넣을 건지
                int y = Integer.parseInt(token[1]); // 몇개를 넣을 건지
                
                for(int i =0; i<y; i++) {
                	int num = Integer.parseInt(token[2+i]);
                    list.add(x+i,num);
                }
            }
            
            System.out.print("#" +test_case + " ");
            
            for(int i =0; i < 10; i++) {
            	System.out.print(list.get(i) + " ");
            }
            
            System.out.println();
           	
		}
	}
}