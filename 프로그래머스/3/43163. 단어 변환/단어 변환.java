import java.util.*;
class Solution {
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        
        boolean[] visited = new boolean[words.length];
        Queue<String> que = new LinkedList<>();
        Queue<Integer> depth = new LinkedList<>();
        
        que.add(begin);
        depth.add(0);
        
        while(!que.isEmpty()) {
            String s = que.poll();
            int cnt = depth.poll();
            
            if(s.equals(target)) return cnt;
            
            for(int i = 0; i< words.length; i++) {
                if(!visited[i] && change(s,words[i])) {
                    visited[i] = true;
                    que.add(words[i]);
                    depth.add(cnt+1);
                }
            }
        }
        
        
        return answer;
    }
    
    public boolean change(String a, String b) {
        int diff = 0; 
        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) != b.charAt(i)) diff++;
            if(diff > 1) return false;
        }
        return diff == 1;
    }
}

