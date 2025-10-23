import java.util.*;
class Solution {
    public int solution(int[] players, int m, int k) {
        int answer = 0;
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i< 24; i++) {
            while(!pq.isEmpty() && pq.peek() <= i) {
                pq.poll();
            }
            
            int need = players[i] / m;
            if(pq.size() <need) {
                for(int j = pq.size(); j < need; j++) {
                    pq.add(i+k);
                    answer++;
                }
            }
        }
        return answer;
    }
}