import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        Map<String,Integer> map = new HashMap<>();
        
        for(int i = 0; i < want.length; i++) {
            map.put(want[i],number[i]);
        }
        
        for(int i = 0; i<= discount.length - 10; i++) {
            Map<String,Integer> tempMap = new HashMap<>(map);
            for(int j = i; j < i+10; j++) {
                String s = discount[j];
                
                if(tempMap.containsKey(s)) {
                    tempMap.put(s,tempMap.get(s) -1);
                }else break;
            }
            boolean check = true;
            for(int value : tempMap.values()) {
                if(value != 0) {
                    check = false;
                }
            }
            
            if(check) {answer++;}
            
        }
        return answer;
    }
}