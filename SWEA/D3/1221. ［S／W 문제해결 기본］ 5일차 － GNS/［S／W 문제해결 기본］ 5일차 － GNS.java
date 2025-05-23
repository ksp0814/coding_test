
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        
		String[] GNS = {"ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN"};
        
		for(int test_case = 1; test_case <= T; test_case++)
		{
			String s = sc.next();
            int len =sc.nextInt();
            sc.nextLine();
            
            int[] list = new int[10];
            
            String ss = sc.nextLine();
            
            String[] s_list = ss.split(" ");
            
            for(int i = 0; i < len; i++) {
            	for(int j =0; j < 10; j++) {
                	if(s_list[i].equals(GNS[j])){
                    	list[j]++;
                    }
                }
            }
            
            System.out.println("#" +test_case);
            for(int i =0; i < 10; i++){
            	for(int j =0; j <list[i]; j++) {
                	System.out.print(GNS[i] + " ");
                }
            }
            
            System.out.println();
            
            
            
		}
	}
}