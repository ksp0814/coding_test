import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        // 각 숫자의 약수 개수를 계산
        for (int i = 1; i <= number; i++) {
            int divisorCount = 0;
            
            // i의 약수 개수 구하기
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    divisorCount++; // j는 약수
                    if (j != i / j) {
                        divisorCount++; // i / j도 약수
                    }
                }
            }
            
            // 약수 개수가 limit보다 크면 power로 대체
            if (divisorCount > limit) {
                answer += power;
            } else {
                answer += divisorCount;
            }
        }
        
        return answer;
    }
}
