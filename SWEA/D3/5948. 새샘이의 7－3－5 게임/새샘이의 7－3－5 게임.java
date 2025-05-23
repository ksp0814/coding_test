
import java.util.*;
import java.io.*;


class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
		
            int[] list = new int[7];
			List<Integer> ans = new ArrayList<>();
            
            for (int i =0; i <7; i++) {
            	list[i] = sc.nextInt();
            }
            
            for(int i =0; i <5; i++) {
            	for (int j = i+1; j<6; j++) {
                	for(int k = j+1; k<7; k++) {
                    	int sum = list[i]+list[j]+list[k];
                        if(!ans.contains(sum)){ // ans에 중복 값이 있는지 확인 없다면 ans에 추가
                        ans.add(sum);
                        } else continue;
                    }
                }
            }
            
            Collections.sort(ans);
            
            System.out.println("#"+test_case + " " + ans.get(ans.size() - 5));
            
            
		}
	}
}