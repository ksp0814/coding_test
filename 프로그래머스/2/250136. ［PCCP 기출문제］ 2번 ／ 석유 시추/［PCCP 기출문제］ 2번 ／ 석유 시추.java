import java.util.*; 

class Solution {
    public int solution(int[][] land) {
        int answer = 0;
        
        int n = land.length;
        int m = land[0].length;
        
        boolean[][] visited = new boolean[n][m];
        int[] oil = new int[m];
        
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,1,-1};
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(land[i][j] == 1 && !visited[i][j]) {
                    int cnt = 0;
                    Set<Integer> col = new HashSet<>();
                    
                    
                    Queue<int[]> que = new LinkedList<>();
                    que.add(new int[]{i,j});
                    visited[i][j] = true;
                    
                    while(!que.isEmpty()) {
                        int[] cur = que.poll();
                        cnt++;
                        col.add(cur[1]);
                        
                        for(int k =0; k < 4; k++) {
                            int x = cur[0] + dx[k];
                            int y = cur[1] + dy[k];
                            if(x>=0 && x < n && y >= 0 && y < m) {
                                if(land[x][y] == 1 && !visited[x][y]) {
                                    visited[x][y] = true;
                                    que.add(new int[]{x,y});
                                }
                            }
                        }
                    }
                    
                    for(int c : col) {
                        oil[c] += cnt;
                    }
                }
            }
        }
        
        for(int i : oil) {
            answer = Math.max(answer,i);
        }
        return answer;
    }
}