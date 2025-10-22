import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        int temp = 0;
        
        for(int i = 0; i < commands.length; i++) {
            int o = commands[i][0];
            int j = commands[i][1];
            int k = commands[i][2];
            
            ArrayList<Integer> list = new ArrayList<>();
            
            for(int x = o-1; x < j; x++) {
                list.add(array[x]);
            }
            
            Collections.sort(list);
            
            answer[temp++] = list.get(k-1);
        }
        return answer;
    }
}