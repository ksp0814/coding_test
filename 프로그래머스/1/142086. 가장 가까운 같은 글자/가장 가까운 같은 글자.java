class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;
        for(int i =1; i<s.length(); i++){
            for(int y = i-1 ; y>=0; y--){
                if(s.charAt(i)== s.charAt(y)){
                    answer[i] = i-y;
                    break;
                }else {
                    answer[i] = -1;
                }
            }
        }
        return answer;
    }
}