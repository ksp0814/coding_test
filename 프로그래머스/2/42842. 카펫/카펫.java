class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        // brown + yellow = total
        // total == answer[0] * answer[1];
        
        int total = brown + yellow; // 전체 면적
        
        for( int h =3 ; h <= total; h++) {
            if(total % h == 0) {
                int w = total / h; // 가로 길이
                
                if((w-2) * (h-2) == yellow) {
                    answer[0] = w;
                    answer[1] = h;
                    break;
                }
            }
        }
        
        
        
        return answer;
    }
}