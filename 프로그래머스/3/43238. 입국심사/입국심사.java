import java.util.*;
class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        
        int len = times.length;
        
        Arrays.sort(times);
        
        long left = 0;
        long right = times[len -1] * (long)n;
        
        while(left <= right) {
            long mid = (left+right) / 2;
            long time = 0;
            
            for(int i =0; i < len; i++) {
                time += mid/times[i];
            }
            if(time < n) {
                left = mid + 1;
            } else{
                right = mid -1;
                answer = mid;
            }
        }
        
        return answer;
    }
}