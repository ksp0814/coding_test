import java.util.*;
class Solution {
    public String solution(String number, int k) {
        String answer = "";
        Deque<Character> que = new ArrayDeque<>();
        
        for(char c : number.toCharArray()) {
            while(k > 0 && !que.isEmpty() && que.peekLast() < c) {
                que.pollLast();
                k--;
            }
            que.add(c);
        }
        
        while(k > 0) {
            que.pollLast();
            k--;
        }
        
        for(char c : que) {
            answer += c;
        }
        
        return answer;
    }
}