
import java.util.*;
import java.io.*;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <= 10; test_case++)
		{
			int[][] list = new int[100][100];
            
            List<Integer> res = new ArrayList<>();
            
            int N = sc.nextInt();
            
            for(int i = 0; i < 100; i++) {
            	for(int j =0; j < 100; j++) {
                	list[i][j] = sc.nextInt();
                }
            }
            int x =0;
            int y =0;

            for(int i =0; i <100; i++) {
            	int row = 0;
                int col = 0;
                for (int j =0; j < 100; j++){
                	row+= list[i][j];
                    col+=list[j][i];
                }
                x+=list[i][i];
                y+= list[i][100-1-i];
                res.add(row);
                res.add(col);
            }
            res.add(x);
            res.add(y);
            
            int maxNum = Collections.max(res);
            
            System.out.println("#" + test_case + " " + maxNum);
		}
	}
}