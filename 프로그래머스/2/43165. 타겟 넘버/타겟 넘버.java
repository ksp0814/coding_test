public class Solution {
    int[] numbers;
    int ans;
    int target;


    void dfs(int index, int sum) {

        if(index == numbers.length) {
            if(sum == target) ans++;
            return;
        }

        dfs(index+1, sum + numbers[index]);
        dfs(index+1, sum - numbers[index]);
    }
    public int solution(int[] numbers, int target){
        ans = 0;
        this.numbers = numbers;
        this.target = target;

        dfs(0,0);

        return ans;
    }
}