import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        Stack<Integer> stack = new Stack<>();
        
        for(int s : ingredient) {
            stack.push(s);
            
            int len = stack.size();
            
            if(len >= 4) {
                if(stack.get(len-4) == 1 &&
                  stack.get(len-3) == 2 &&
                  stack.get(len-2) == 3 &&
                  stack.get(len-1) == 1) {
                    
                    for(int i = 0; i < 4; i++) {
                        stack.pop();
                    }
                    
                    answer++;
                }
                    
                    
            }
        }
        
        
        
        return answer;
    }
}