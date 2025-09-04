import java.util.*;
class Solution {
    public int solution(String numbers) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        
        int len = numbers.length();
        
        for(int i = 1; i <= len; i++) {
            make("", numbers,i ,set);
        }
        
        
        for(int i : set) {
            if(check(i)) {
                answer++;
            }
        }
        
        
        return answer;
    }
    
    public void make(String s, String numbers, int len, Set<Integer> set) { if(s.length() == len) {
        set.add(Integer.parseInt(s));
        return;
    }
                                                                           
                                                                           for(int i = 0; i < numbers.length(); i++) {
                                                                               make(s + numbers.charAt(i), numbers.substring(0,i) + numbers.substring( i+1), len,set);
                                                                           }
        
    }
    
    public boolean check(int n) {
        if(n<2) return false;
        for(int i = 2; i * i <= n; i++) {
            if(n%i == 0) return false;
        }
        return true;
    }
}