import java.util.*;
class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        
        int len = times.length;
        
        Arrays.sort(times);
        
        long left = 0;
        long right = times[len -1] * (long)n; // 가장 느린 입국심사원이 n명을 다 커버했을 경우
        
        while(left <= right) { // 이분 탐색을 시작
            long mid = (left+right) / 2; // 중간시간 구함
            long time = 0;
            
            for(int i =0; i < len; i++) {
                time += mid/times[i]; // 중간시간동안에 처리 가능한 총 인원을 구한다.
            }
            if(time < n) {
                left = mid + 1; // 처리인원이 부족할 시 left값을 mid + 1
            } else{
                right = mid -1; // 처리인원이 n명 이상일 시 right 값을 1 더함
                answer = mid;
            }
        }
        
        return answer;
    }
}