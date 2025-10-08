class Solution {
    int answer;
    public int solution(int[] numbers, int target) {
        answer = 0;
        
        dfs(numbers,0,0,target);
        
        
        return answer;
    }
    
    void dfs(int[] numbers,int index, int sum, int res) {
        if(index == numbers.length) {
            if(sum == res) {
                answer++;
            }
            return;
        }
        
        dfs(numbers,index+1, sum + numbers[index],res);
        dfs(numbers,index+1, sum - numbers[index],res);
    }
}