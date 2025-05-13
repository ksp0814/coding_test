
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    static int[][] list;
    static int max;
    static int N;
    static int L;
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{

            N = sc.nextInt();
            L = sc.nextInt();
            
            list = new int[N][2];
            
            for(int i =0; i < N; i++) {
            	list[i][0] = sc.nextInt();
                list[i][1] = sc.nextInt();
            }
            max = 0;
            dfs(0,0,0);
            
            System.out.println("#" + test_case + " " + max);
		}
	}
    
    static void dfs(int idx, int tasteSum, int calSum) {
		if( calSum > L) return;        
        if(idx == N) {
        	max = Math.max(max, tasteSum);
            return;
        }
        
         // 현재 재료 선택
        dfs(idx + 1, tasteSum + list[idx][0], calSum + list[idx][1]);

        // 현재 재료 선택하지 않음
        dfs(idx + 1, tasteSum, calSum);
    }
}