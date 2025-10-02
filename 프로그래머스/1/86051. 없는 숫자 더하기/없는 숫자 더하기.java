class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        int[] list = new int[10];
        
        for(int i = 0; i < numbers.length; i++) {
            int temp = numbers[i];
            list[temp]++;
        }
        
        for(int i = 0; i < 10; i++){
            if(list[i] == 0) {
                answer+=i;
            }
        }
        return answer;
    }
}