class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        int temp = 1;
        long t = 0;
        
        for(int i = 0; i < count; i++) {
            t += price * temp++;
        }
        
        answer = t - money;
        if ( t <= money) return answer = 0;

        return answer;
    }
}