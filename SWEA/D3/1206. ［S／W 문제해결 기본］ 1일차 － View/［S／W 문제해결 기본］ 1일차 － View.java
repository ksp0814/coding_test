import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int cnt = 1;
        
        while (cnt <= 10) {
            int N = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int[] list = new int[N];
            int count = 0;
            
            for (int i =0; i < N; i++) {
                list[i] = Integer.parseInt(st.nextToken());
			}
            for(int i = 2; i < N - 2; i++) {
                int h = Math.max(Math.max(list[i-2],list[i-1]),Math.max(list[i+2],list[i+1]));
                if( list[i] > h) {
                    	count += (list[i]-h);
                }
			}
            
            System.out.println("#" + cnt + " " + count);
            cnt++;
        }
    }
}