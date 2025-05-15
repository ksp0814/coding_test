
import java.util.*;
import java.io.*;

class Solution
{
    static int[] nx = {-1,1,0,0,-1,-1,1,1};
    static int[] ny = {0,0,-1,1,-1,1,-1,1};
    static int N;
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			N = sc.nextInt();
            int M = sc.nextInt();
            
            int[][] list = new int[N][N];
            
            list[N/2-1][N/2-1] = 2; 
            list[N/2][N/2] = 2;
            list[N/2-1][N/2] = 1;
            list[N/2][N/2-1] = 1;
            
            int w =0;
            int b = 0;
            
            for(int i =0; i < M ; i++) {
            	int x = sc.nextInt() -1;
                int y = sc.nextInt() -1;
                int dol = sc.nextInt();
                
                list[x][y] = dol;
                
                check(list , x,y,dol);
            }
            
            for(int i =0; i< N; i++){
            	for(int j =0; j <N; j++){
                	if(list[i][j] == 1) {
                    	b++;
                    } else if (list[i][j] == 2) {
                    	w++;
                    }
                }
            }
            
            System.out.println("#" + test_case + " " + b+ " " + w);

		}
	}
    
    static void check(int[][] list , int x, int y, int stone) {
        for(int i =0; i < 8; i++) {
        	int dr = nx[i];
            int dc = ny[i];
            ArrayList<int[]> stoneFlip = new ArrayList<>();
            
            int curr_r = x + dr;
            int curr_c = y + dc;
            
            boolean between = false; // 중간에 상대방 돌이 있는지
            
            while(curr_r >= 0 && curr_r < N && curr_c >=0 && curr_c <N) {
            	if(list[curr_r][curr_c] == 0) {
                	stoneFlip.clear();
                    break;
                } else if (list[curr_r][curr_c] == stone ) {
                	if(between) {
                    	for(int[] pos : stoneFlip) {
                        	list[pos[0]][pos[1]] = stone;
                        }
                    }
                    break;
                } else {
                	stoneFlip.add(new int[]{curr_r,curr_c});
                    between = true;                        
                }
                curr_r +=dr;
                curr_c +=dc;
                                  
            }
        }
    }
}