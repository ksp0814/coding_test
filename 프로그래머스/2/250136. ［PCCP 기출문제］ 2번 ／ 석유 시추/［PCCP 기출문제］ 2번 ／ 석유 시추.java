import java.util.*;

class Solution {
    int n, m;
    boolean[][] visited;
    int[][] land;
    int[] dx = {1,-1,0,0};
    int[] dy = {0,0,1,-1};
    
    public int solution(int[][] land) {
        this.n = land.length;
        this.m = land[0].length;
        this.land = land;
        this.visited = new boolean[n][m];
        
        int[] oil = new int[m]; 
        int answer = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (land[i][j] == 1 && !visited[i][j]) {
                    int size = 0;
                    Set<Integer> cols = new HashSet<>();
                    
                    Stack<int[]> stack = new Stack<>();
                    stack.push(new int[]{i, j});
                    visited[i][j] = true;
                    
                    while (!stack.isEmpty()) {
                        int[] cur = stack.pop();
                        int x = cur[0], y = cur[1];
                        
                        size++;
                        cols.add(y);
                        
                        for (int k = 0; k < 4; k++) {
                            int nx = x + dx[k];
                            int ny = y + dy[k];
                            
                            if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                                if (land[nx][ny] == 1 && !visited[nx][ny]) {
                                    visited[nx][ny] = true;
                                    stack.push(new int[]{nx, ny});
                                }
                            }
                        }
                    }
                    
                    for (int c : cols) {
                        oil[c] += size;
                    }
                }
            }
        }
        
        for (int num : oil) {
            answer = Math.max(answer, num);
        }
        
        return answer;
    }
}
