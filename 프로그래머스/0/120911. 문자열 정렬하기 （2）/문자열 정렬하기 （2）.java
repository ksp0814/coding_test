import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        ArrayList<Character> arr = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if(c >= 'A' && c <= 'Z'){
                c = (char) (c+32);
            }
            arr.add(c);
        }
        Collections.sort(arr);
        
        
        for (char s : arr) {
            answer += s;
        }
        return answer;
    }
}