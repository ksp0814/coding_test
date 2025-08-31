class Solution {
    public int solution(int[][] triangle) {
        int answer = 0;

        int[][] dp = new int[triangle.length][triangle.length];
        dp[0][0] = triangle[0][0];
        
        for ( int i =1; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++ ) {
                int right = dp[i-1][j];
                int left;
                if ( j -1 < 0) {
                    left = right-1;
                } else left = dp[i-1][j-1];
                dp[i][j] = triangle[i][j] + Math.max(left,right);
            }
        } 
        
        for(int i : dp[triangle.length-1]) {
            if(i > answer) answer = i;
        }
        
        return answer;
    }
}