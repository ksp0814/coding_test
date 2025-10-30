class Solution {
    public String solution(String s) {
        String answer = "";
        int idx = 0;  // 각 단어 내에서의 인덱스
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if(c == ' ') {
                answer += ' ';
                idx = 0;  // 공백을 만나면 인덱스 초기화
            } else {
                if(idx % 2 == 0) {
                    answer += Character.toUpperCase(c);
                } else {
                    answer += Character.toLowerCase(c);
                }
                idx++;
            }
        }
        
        return answer;
    }
}