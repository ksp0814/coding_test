import java.util.*;
class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        
        int len = progresses.length;
        
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < len; i++) {
            int tmp = 0;
            while(progresses[i] < 100) {
                progresses[i] += speeds[i];
                tmp++;
                if(progresses[i] >= 100) break;
            }
            list.add(tmp);
        }
        
        int dev = list.get(0);
        int cnt = 1;
        
        for(int i =1; i < list.size(); i++) {
            int day = list.get(i);
            if(day <= dev) {
                cnt++;
            } else {
                answer.add(cnt);
                cnt = 1;
                dev = day;
            }
        }
        
        answer.add(cnt);
        
        return answer;
    }
}