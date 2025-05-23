
import java.util.*;
import java.io.*;


class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);


		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int n = sc.nextInt();
            
            List<Integer> list = new ArrayList<>();
            
            for(int i =0; i < n; i++) {
            	list.add(sc.nextInt());
            }
            
            int c = sc.nextInt();
            sc.nextLine();
            
            String s = sc.nextLine();
            
            String[] ss = s.split(" ");
            
            for (int i = 0; i<ss.length; i++) {
            	if(ss[i].equals("I")) {
                	int idx = Integer.parseInt(ss[i+1]);
                    int num = Integer.parseInt(ss[i+2]);
                    
                    for(int j = i +3; j < (i+3)+num; j++) {
                    	list.add(idx++, Integer.parseInt(ss[j]));
                    }
                } else if(ss[i].equals("D")) {
                	int idx = Integer.parseInt(ss[i+1]);
                    int num = Integer.parseInt(ss[i+2]);
                    
                    for(int j =0; j <num; j++) {
                    	list.remove(idx);
                    }
                }
            }
            
            System.out.print("#" + test_case + " ");
            
            for(int i =0; i< 10; i++) {
            	System.out.print(list.get(i) + " ");
            }

            System.out.println();
		}
	}
}