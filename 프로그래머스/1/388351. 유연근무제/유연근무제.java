import java.util.*;

class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        
        for (int i = 0; i < schedules.length; i++) {
            if (isPossible(schedules[i], timelogs[i], startday)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    public boolean isPossible(int standard, int[] day, int startday) {
        int hour = standard / 100;
        int min = standard % 100;
        min += 10;
        
        if (min >= 60) {
            hour++;
            min -= 60;
        }
        
        int maxTime = hour * 100 + min; // 허용되는 최대 출근 시각
        
        for (int i = 0; i < day.length; i++) {
            if (startday == 6 || startday == 7) { // 토, 일은 건너뜀
                startday = (startday % 7) + 1;
                continue;
            }

            if (day[i] > maxTime) {
                return false; // 출근 시간이 허용 범위를 초과하면 실패
            }
            
            startday = (startday % 7) + 1; // 다음 요일로 이동
        }
        
        return true;
    }
}