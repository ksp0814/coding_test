import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        Queue<Integer> que = new LinkedList<>();
        
        for(int x : prices) {
            que.offer(x);
        }
        int idx = 0;
        
        while(!que.isEmpty()) {
            int target = que.poll();
            
            for(int x : que) {
                answer[idx]++;
                if(target > x) {
                    break;
                }
            }
            idx++;
        }
        return answer;
    }
}