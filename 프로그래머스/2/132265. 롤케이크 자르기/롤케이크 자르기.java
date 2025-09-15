class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        int len = topping.length;
        
        int[] leftCount = new int[10001];
        int[] rightCount = new int[10001];
        
        int left = 0;
        int right = 0;
        
        for(int t : topping) {
            if(leftCount[t] == 0) left++;
            leftCount[t]++;
        }
        
        for(int i = len - 1 ; i >=0; i--) {
            leftCount[topping[i]]--;
            if(leftCount[topping[i]] == 0) left--;
            
            if(rightCount[topping[i]] == 0) right++;
            rightCount[topping[i]]++;
            
            if(left==right) answer++;
        }
        return answer;
    }
}