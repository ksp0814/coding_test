
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    static int ans;
    static int[] list;
    static int N,K;
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();


		for(int test_case = 1; test_case <= T; test_case++)
		{
		
			N = sc.nextInt();
            K =sc.nextInt();
            
            list = new int[N];
            
            for(int i =0; i< N; i++){
            	list[i] = sc.nextInt();
            }
            ans = 0;
            dfs(0, 0);
            System.out.println("#"+test_case+" " + ans);
   
		}
	}
    
    static void dfs(int index , int sum){
    	if(index == N) {
        	if(sum == K){
            	ans++;
            }
            return;
        }
        
        dfs(index+1, sum+ list[index]);
        
        dfs(index+1, sum);
    }
}