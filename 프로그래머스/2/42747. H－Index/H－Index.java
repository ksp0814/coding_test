import java.util.*;
class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        int len = citations.length; // 발표한 논문의 수
        
        for(int i =0; i < 100000; i++) {
            int temp = 0; // 인용된 논문 수 h
            int tmp = 0; // h 번 이하 인용
            for(int j =0; j < len; j++) {
                if(citations[j] >= i) {
                    temp++;
                } else if (citations[j] < i) {
                    tmp++;
                }
            }
            if (temp >= i) {
                answer = Math.max(answer,i);
            }
        }
        
        return answer;
    }
}