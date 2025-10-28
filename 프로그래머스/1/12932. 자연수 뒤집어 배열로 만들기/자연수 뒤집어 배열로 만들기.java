class Solution {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        
        int[] answer = new int[s.length()];
        
        int temp = 0;
        
        for(int i = s.length()-1; i >=0; i--) {
            answer[temp++] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return answer;
    }
}