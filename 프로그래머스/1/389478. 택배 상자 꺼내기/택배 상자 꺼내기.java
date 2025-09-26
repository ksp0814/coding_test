class Solution {
    public int solution(int n, int w, int num) {
        int answer = 1;
        
        int[] list = new int[w];
            
        for(int i = 0; i < w; i++) {
            list[i] = 1 + (2*i);
        }
        
        int floor = (num - 1) / w; // 현재 몇 층에 있는지
        int row;
        
        while(num < n) {
            if(floor % 2 == 0) { // 현재 층수가 짝수일경우 
                row = w -1 - ((num -1) % w);
                if(num + list[row] <= n){
                    num += list[row];
                }else break;
            } else {
                row = w - 1 - ((num -1) % w);
                if(num + list[row] <= n) {
                    num += list[row];
                } else break;
            }
            floor = (num -1) /w;
            answer++;
            
            if(num >= n) {
                break;
            }
        }
        
        return answer;
    }
}