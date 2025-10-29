import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = new String[s.length()];
        
        for(int i = 0; i < s.length(); i++) {
            arr[i] = String.valueOf(s.charAt(i));
        }
        Arrays.sort(arr,Collections.reverseOrder());
        
        for(String ss : arr) {
            answer += ss;
        }
        return answer;
    }
}