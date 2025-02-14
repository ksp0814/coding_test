import java.util.*;

public class Solution {
    static int[] dx = {0,0,-1,1};
    static int[] dy = {-1,1,0,0};
    
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        boolean[][] visited = new boolean[n][m];
        Queue<int[]> que = new LinkedList<>();
        que.add(new int[]{0,0,1});
        visited[0][0] = true;
        
        while (!que.isEmpty()) {
            int[] cur = que.poll();
            int x = cur[0];
            int y = cur[1];
            int cnt = cur[2];
            
            if( x == n -1  && y == m -1) {
                return cnt;
            }
            
            for(int i = 0; i<4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx >=0 && ny >= 0 && nx < n && ny < m && maps[nx][ny] == 1 && !visited[nx][ny]){
                    visited[nx][ny] = true;
                    que.add(new int[]{nx, ny, cnt+1});
                }
            }
        }
        return -1;
    }
}
