class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        String s = String.valueOf(x);
        
        int n = 0;
        
        for(int i = 0; i < s.length(); i++) {
            n += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        
        if(x % n == 0) answer=true;
        else answer = false;
        return answer;
    }
}