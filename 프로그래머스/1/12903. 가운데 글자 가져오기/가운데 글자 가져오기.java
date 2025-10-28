class Solution {
    public String solution(String s) {
        String answer = "";
        
        int len = s.length();
        
        if(len % 2 == 0) {
            int temp = len / 2;
            
            answer += s.charAt(temp-1);
            answer += s.charAt(temp);
        } else {
            int temp = len / 2;
            answer += s.charAt(temp);
        }
        return answer;
    }
}