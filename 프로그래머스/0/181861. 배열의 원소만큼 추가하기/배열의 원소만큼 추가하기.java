class Solution {
    public int[] solution(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i ++) {
            total += arr[i];
        }
        int[] answer = new int[total];
        
        int ran = 0;
        for(int i =0; i < arr.length; i++) {
            for(int j = 0; j < arr[i]; j++) {
                answer[ran++] = arr[i];
            }
        }
        return answer;
    }
}