
import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
        
                int[][] list = new int[300][300];
        list[0][0] = 1;

        for(int i = 1; i < 300; i++){
            list[i][0] = list[i-1][0]+i;
        }

        for(int r= 0; r < 300; r++){
            for(int c = 1; c < 300; c++){
                list[r][c] = list[r][c-1] + (r+c+1);
            }
        }

		for(int test_case = 1; test_case <= T; test_case++)
		{
             int p = sc.nextInt();
            int q = sc.nextInt();

            int[] p_idx = new int[2];
            int[] q_idx = new int[2];

            for(int r = 0; r < 300; r++){
                for(int c = 0; c < 300; c++){
                    if(list[r][c] == p){
                        p_idx[0] = r+1;
                        p_idx[1] = c+1;
                    }
                    if(list[r][c] == q){
                        q_idx[0] = r+1;
                        q_idx[1] = c+1;
                    }
                }
            }

            int target_x = p_idx[0]+q_idx[0];
            int target_y = p_idx[1]+q_idx[1];

            int result = list[target_x-1][target_y-1];

            System.out.println("#" + test_case + " " + result);
		

		}
	}
}