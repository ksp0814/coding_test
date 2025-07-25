import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int len = commands.length;
        int[] answer = new int[len];
        
        for(int i = 0; i < len; i++) {
            int[] temp = new int[commands[i][1] - commands[i][0] + 1];
            int tmp =0;
            for(int j = (commands[i][0])-1; j < commands[i][1]; j++) {
                temp[tmp++] = array[j];
            }
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }
    
        
        return answer;
    }
}