
import java.util.*;
import java.io.*;

class Solution
{
    static int change;
    static int max;
    static boolean[][] visited;
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();
		for(int test_case = 1; test_case <= T; test_case++)
		{
			String s = sc.next();
         	change = sc.nextInt();
            int[] arr = new int[s.length()];
            
            // 숫자판 정보를 문자열로 입력을 받고
            // 입력받은 문자열을 int형으로 변환해서 arr 리스트에 하나씩 추가해주고;
            
            for (int i =0; i < s.length(); i++){
            	arr[i] = s.charAt(i) -'0';
            }
            max =0;
            visited = new boolean[1000000][11];
            dfs(arr,0);
            
            System.out.println("#" + test_case + " " + max);
		}
	}
    
    static void dfs(int[] arr, int depth) {
    	if(depth == change) {
        	int num =0;
            for(int i = 0; i < arr.length; i++){
            	num = num *10 + arr[i];
            }
            max =Math.max(max,num);
            return;
        }
        int num = 0;
        for(int i = 0; i < arr.length; i++){
           	num = num *10 + arr[i];
        }
        
        if(visited[num][depth]) return;
        visited[num][depth] = true;
        
        
        for(int i =0; i < arr.length -1; i++) {
        	for(int j =i+1; j<arr.length;j++){
            swap(arr,i,j);
            dfs(arr,depth+1);
            swap(arr,i,j);
            }
        }
    }
    
    static void swap(int[] arr, int i, int j) {
    	int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}