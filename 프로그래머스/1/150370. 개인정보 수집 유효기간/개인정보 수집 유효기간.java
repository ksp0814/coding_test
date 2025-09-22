import java.util.*;
class Solution {
    public List<Integer> solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        
        int year = Integer.parseInt(today.substring(0,4)); // 년도
        int month = Integer.parseInt(today.substring(5,7)); // 달
        int day = Integer.parseInt(today.substring(8)); // 요일
        
        for(int i = 0; i < privacies.length; i++) {
            String s = privacies[i];
            
            String temp = s.substring(11);
            
            int t_year = Integer.parseInt(s.substring(0,4));
            int t_month = Integer.parseInt(s.substring(5,7));
            int t_day = Integer.parseInt(s.substring(8,10));
            
            for(int j = 0; j < terms.length; j++) {
                String ss = terms[j];
                
                String t_temp = ss.substring(0,1);
                int range = Integer.parseInt(ss.substring(2));
                
                if(temp.equals(t_temp)) {
                    
                    int target = t_year * 12 * 28 + t_month * 28 + t_day + ( range*28) - 1;
                    int todays = year * 12 * 28 + month *28 + day;
                    
                    if(target < todays) {
                        answer.add(i+1);
                    }
                    break;
                }
                
            
            }
            
            
        }
        
        return answer;
    }
}