class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for(int i = 0; i < prices.length-1; i++) {
            int temp = 0;
            int target = prices[i];
            
            for(int j = i+1; j < prices.length; j++) {
                temp++;
                if(target <= prices[j]) {
                    continue;
                } else {
                    break;
                }
            }
            answer[i] = temp;
        }
        return answer;
    }
}