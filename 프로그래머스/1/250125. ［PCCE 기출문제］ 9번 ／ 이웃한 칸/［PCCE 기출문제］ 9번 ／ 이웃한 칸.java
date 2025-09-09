class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        
        String s = board[h][w];
        
        int[] dx = {-1,1,0,0};
        int[] dy = {0,0,-1,1};
        
        for(int i = 0; i < 4; i++) {
            int nx = h + dx[i];
            int ny = w + dy[i];
            
            if(nx < board.length && nx >= 0 && ny >= 0 && ny < board[0].length) {
                if(board[nx][ny].equals(s)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}