
import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);


		for(int test_case = 1; test_case <= 10; test_case++)
		{
            List<Integer> list = new ArrayList<>();
            
            int dump = sc.nextInt();
            
            for(int i  =0; i < 100; i++){
            	list.add(sc.nextInt());
            }
            
            
            for(int i =0; i< dump; i++) {
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;
                int maxIdx = 0;
                int minIdx = 0;
            	for(int x= 0; x<100; x++){
                	int tmp = list.get(x);
                    if (tmp > max){
                    	max = tmp;
                        maxIdx = x;
                    }
                    if ( tmp < min) {
                    	min = tmp;
                        minIdx = x;
                    }
                }
                
                list.set(maxIdx, list.get(maxIdx) -1);
                
                list.set(minIdx, list.get(minIdx) +1);
            }
            
            
            int minNum = Collections.min(list);
            
            int maxNum = Collections.max(list);
            
            System.out.println("#" + test_case + " " + (maxNum-minNum));


		}
	}
}