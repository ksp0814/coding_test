import java.util.*;
class Solution {
    public long solution(long n) {
        StringBuilder sb = new StringBuilder();
        long answer = 0;
        
        String s = String.valueOf(n);
        
        Integer[] list = new Integer[s.length()];
        
        
        for(int i = 0; i < s.length(); i++) {
            list[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        
        Arrays.sort(list,Collections.reverseOrder());
        
        
        for(int i = 0; i < s.length(); i++) {
            sb.append(list[i]);
        }
        
        answer = Long.parseLong(sb.toString());
        return answer;
    }
}