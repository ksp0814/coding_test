import java.util.Scanner;
import java.io.FileInputStream;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
		
            
            int[][] list = new int[9][9];
            
            for(int i =0; i <9; i++) {
            	for(int j =0; j< 9; j++) {
                	list[i][j] = sc.nextInt();
                }
            }
            
            boolean check = true;
            
            for(int i =0; i < 9; i++) {
                boolean[] row = new boolean[10];
                boolean[] col = new boolean[10];
            	for(int j=0; j<9;j++) {
                    int rownum = list[i][j];
                    int colnum = list[j][i];
                    if(row[rownum] || col[colnum]) {
                    	check = false;
                        break;
                    }
                    row[rownum] = true;
                    col[colnum] = true;
                }
            }
            
            for(int i =0; i<9 && check; i+=3) {
            	for(int j =0; j< 9; j+=3){
                	boolean[] square = new boolean[10];
                    for(int row = i; row < i+3; row++){
                    	for(int col = j; col< j+3; col++) {
                        	int num = list[row][col];
                            if (square[num]) {
                            	check = false;
                                break;
                            }
                            square[num] = true;
                        }
                    }
                }
            }
		
            if(check == false) {
            	System.out.println("#" + test_case+ " 0");
            } else System.out.println("#" + test_case+ " 1");
		}
	}
}