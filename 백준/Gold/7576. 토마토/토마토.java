import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];
        boolean[][] visited = new boolean[n][m];

        Queue<int[]> que = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for ( int j = 0; j < m; j++) {
                arr[i][j]= Integer.parseInt(st.nextToken());

                if (arr[i][j]==1) {
                    que.add(new int[]{i,j,0});
                    visited[i][j]=true;
                }
            }
        }
        System.out.println(bfs(que,arr, visited,n,m));

    }

    public static int bfs(Queue<int[]> queue, int[][] arr, boolean[][] visited,int n, int m) {

        int maxDay = 0;

        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            int x = node[0],y = node[1];
            int day = node[2];

            maxDay = Math.max(maxDay, day);

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < n && ny >=0 && ny < m && !visited[nx][ny] && arr[nx][ny]==0) {
                    visited[nx][ny] = true;
                    arr[nx][ny]=1;
                    queue.add(new int[]{nx,ny,day+1});
                }
            }
        }

        for (int i =0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if (arr[i][j]==0) {
                    return -1;
                }
            }
        }

        return maxDay;
    }
}
