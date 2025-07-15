class Solution {
    boolean solution(String s) {

        int len = s.length();
        
        int count = 0;
        
        for(int i =0; i < len; i++) {
            if(s.charAt(i) == '(') {
                count++;
            } else if (s.charAt(i) == ')') {
                count--;
            }
            
            if(count < 0) {
                return false;
            }
        }
        
        return count == 0;
    }
}