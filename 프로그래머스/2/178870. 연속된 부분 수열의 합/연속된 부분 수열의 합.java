class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        
        int left = 0;
        int right = 0;
        int len = -1;
        int sum = 0;
        
        for (; left < sequence.length; left++) {
            while(right < sequence.length && sum < k){
                sum += sequence[right++];
            }
            
            if (sum == k) {
                if(len == -1 || len > right - left) {
                    answer[0] = left;
                    answer[1] = right-1;
                    len = right - left;
                }
            }
            sum -= sequence[left];
        }
        
        return answer;
    }
}