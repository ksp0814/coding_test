import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        Queue<Integer> que = new LinkedList<>();
        
        
        int time = 0;
        int idx = 0;
        int weight_check= 0;
        
        for(int i = 0; i<bridge_length; i++) que.offer(0);
        
        while(idx < truck_weights.length) {
            time++;
            
            weight_check -= que.poll();
            
            if(weight_check + truck_weights[idx] <= weight) {
                que.offer(truck_weights[idx]);
                weight_check += truck_weights[idx++];
            } else {
                que.offer(0);
            }
        }
        
        answer = time + bridge_length;
        return answer;
    }
}