import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<int[]> queue = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[]{i, priorities[i]});
            pq.add(priorities[i]);
        }

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            
            if (current[1] == pq.peek()) {
                pq.poll();
                answer++;
                if (current[0] == location) {
                    break;
                }
            } else {
                queue.add(current);  
            }
        }

        return answer;
    }
}
