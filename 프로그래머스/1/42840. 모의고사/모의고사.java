import java.util.*;

class Solution {
    public List<Integer> solution(int[] answers) {
        int[] answer = new int[3];
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
        
        int[][] ans = new int[3][answers.length];
        
        int max = 0;
        
        for(int i = 0; i< answers.length; i++) {
            ans[0][i] = a[i % 5];
            ans[1][i] = b[i % 8];
            ans[2][i] = c[i % 10];
        } 
        
        int[] per = new int[3];
        for(int i = 0; i < 3; i++) {
            int res = 0;
            for(int j =0; j < answers.length;j++){
                if(ans[i][j] == answers[j]) {
                    res++;
                }
            }
            if(max < res) {
                max = res;
            }
            per[i] = res;
        }
        
        
        int tmp =0;
        for(int i = 0; i < 3; i++) {
            if(per[i] == max) {
                answer[tmp++] = i+1;
            }
        }
        
        
        Arrays.sort(answer);
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < 3; i++) {
            if (answer[i] >0) {
                list.add(answer[i]);
            }
        }
        
        return list;
    }
}