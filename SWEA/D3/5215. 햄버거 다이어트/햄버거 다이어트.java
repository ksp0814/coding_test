
import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
    static int n,l;
    static int[][] list;
   	static int max;
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			n = sc.nextInt();
            l = sc.nextInt();
            
            list = new int[n][2];
            
            for (int i =0; i < n; i++) {
            	list[i][0] = sc.nextInt(); // 점수
                list[i][1] = sc.nextInt(); // 칼로리
            }
            
            max = 0;
            check(0,0,0);
            
            System.out.println("#" + test_case + " " + max);
            
		}
	}
    
    static void check(int start, int sum, int cal) {
        if ( cal > l) return;
    	if(start == n) {
        	max = Math.max(max,sum);
            return;
        }
        	check(start+1, sum+ list[start][0], cal + list[start][1]); // 선택한거 
            
            check(start +1, sum, cal); // 선택안한거
        	
        }
    }