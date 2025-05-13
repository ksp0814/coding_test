
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
		
            int N = sc.nextInt();
            int K = sc.nextInt();
            
            int[][] list= new int[N][3];
           
            ArrayList<Double> avg = new ArrayList<>();
            double targetScore = 0;
            
            String[] grade = {"A+", "A0", "A-","B+","B0","B-","C+","C0","C-","D0"};
            
            for(int i=0; i< N ; i++){
            	for(int j =0; j<3; j++) {
                	list[i][j] = sc.nextInt();
                }
                
                double score = (list[i][0] * 0.35) + (list[i][1] * 0.45) + (list[i][2] * 0.2);
                avg.add(score);
                
                if( i == K-1) {
                targetScore = score;
                }
            }
           Collections.sort(avg, Comparator.reverseOrder());
            
            int rank =avg.indexOf(targetScore);
            
            
            int gradeIndex = (rank * 10) / N;
            
            System.out.println("#" + test_case + " "+ grade[gradeIndex]);
            
            
            
		}
	}
}