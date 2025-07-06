import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        String[] str = new String[numbers.length];
        
        for (int i =0; i < numbers.length; i++) {
            str[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(str, (a,b) -> (b+a).compareTo(a+b)); // 내림차순
        
        if(str[0].equals("0")) {
            return "0";
        }
        
        for(String s : str) {
            answer += s;
        }
        
        return answer;
    }
}