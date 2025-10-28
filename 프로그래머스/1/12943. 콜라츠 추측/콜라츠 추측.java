class Solution {
    public int solution(int num) {
        int answer = 0;
        int n = num;
        
        while (answer < 500) {
            answer++;
            if ( n == 1) break;
            
            if(n % 2 == 0) {
                n= n/2;
            } else if(n % 2 == 1) {
                n = n *3 + 1;
            }
        }
        
        if(answer == 500) {
            answer = 0;
        }
        return answer - 1; 
    }
}