import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int[][] list = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    list[i][j] = sc.nextInt();
                }
            }

            System.out.println("#" + test_case);

            int[][] o90 = new int [N][N];
            int[][] o180 = new int[N][N];
            int[][] o270 = new int[N][N];
            
            for (int i = 0; i <N; i++){
            	for(int  j =0; j < N ; j++) {
                	o90[i][j] = list[N-1-j][i];
                    o180[i][j] = list[N-1-i][N-1-j];
                    o270[i][j] = list[j][N-1-i];
                }                                              
        }
            
            for(int i =0; i < N; i++){
            	for(int j =0; j <N; j++) {
                	System.out.print(o90[i][j]);
                }
                System.out.print(" ");
                
                for(int j =0; j<N;j++) {
                	System.out.print(o180[i][j]);
                }
                System.out.print(" ");
                for(int j =0; j<N;j++) {
                	System.out.print(o270[i][j]);
                }
                System.out.println();
            }
        }
        sc.close();
    }
}