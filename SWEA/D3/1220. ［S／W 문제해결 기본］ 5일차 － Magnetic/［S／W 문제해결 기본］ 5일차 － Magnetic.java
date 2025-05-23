
import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		int T = 10;
		
		for(int test_case = 1; test_case <= T; test_case++)
		{
		
			int n = sc.nextInt();
            
            int[][] list = new int[n][n];
            
            for(int i =0; i < n; i++) {
            	for(int j=0; j <n ; j++) {
                	list[i][j] = sc.nextInt();
                }
            }
            
            
        
            int ans =0;
            
            for(int i =0; i< n; i++) { // 1다음에 2가 나와야 교착 상태이므로
            	boolean check_N = false; // 1이 나오는지 확인하는
                for (int j=0; j< n; j++) {
                	if(list[j][i] == 1) {
                    	check_N = true; // 1이 나오면 true 변환
                    } else if(list[j][i] == 2){ // 2가 나오고 check_N이 true라면 ans 증가  -> 즉 교착상태가 하나가 완성
                    	if(check_N) {
                        	ans++;
                            check_N = false; // 교착상태를 하나 했기 때문에 False를 통해 다시 교착상태를 찾는다.
                        }
                    }
                }
            }
            
            System.out.println("#" +test_case + " "+ ans);
		}
	}
}