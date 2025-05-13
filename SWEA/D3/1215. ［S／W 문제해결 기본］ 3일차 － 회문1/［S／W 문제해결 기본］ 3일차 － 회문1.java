
import java.util.*;
import java.io.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

		for(int test_case = 1; test_case <= 10; test_case++)
		{
		
            String[][] list = new String[8][8];
            int target = sc.nextInt();
            
            for(int i =0; i< 8; i++) {
                String line = sc.next();
            	for(int j=0; j < 8; j++) {
                	list[i][j] = String.valueOf(line.charAt(j));
                }
			}
            int count = 0;
            
            // 가로 회문 검사
            for(int i =0; i<8; i++) {
            	for(int j=0; j<=8- target; j++) {
                    boolean check =true;
                    for(int k =0; k< target/2; k++){
 						if(!list[i][j+k].equals(list[i][j+target -1 -k])) {
                        	check =false;
                            break;
                        }
                    }
                    
                    if(check) count++;
                }
            }
            
            //세로 회문 검사
            for(int i = 0; i <= 8 - target; i++){
            	for(int j =0; j < 8; j++) {
                	boolean check = true;
                    for(int k =0; k < target/2;k++) {
                    	if(!list[i+k][j].equals(list[i+target -1 -k][j] )) {
                        	check = false;
                            break;
                        }
                    }
                    if(check) count++;
                }
            }
            System.out.println("#" + test_case + " " + count);
		}
	}
}