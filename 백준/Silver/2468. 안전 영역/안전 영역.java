
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[][] arr;
    static int[] dx = {-1,1,0,0};// 위 아래 오른쪽 왼쪽
    static int[] dy = {0,0,1,-1};
    static int[][] visited;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         n = Integer.parseInt(br.readLine());

         arr = new int[n][n];
         visited = new int[n][n];

         for (int i = 0; i < n; i++) {
             StringTokenizer st = new StringTokenizer(br.readLine());
             for (int j = 0; j < n; j++) {
                 arr[i][j] = Integer.parseInt(st.nextToken());
             }
         }

        System.out.println(check(arr, n));

    }
    static int check(int[][] arr, int n) {
        int max = 0;

        for (int h = 0; h <= 100; h++) {
            visited = new int[n][n];
            int cnt = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][j] > h && visited[i][j] == 0) {
                        dfs(i,j,h);
                        cnt++;
                    }
                }
            }
            max = Math.max(max, cnt);
        }
        return max;
    }

    static void dfs(int i, int j, int h) {
        visited[i][j] = 1;

        for (int k = 0; k < 4; k++) {
            int nx = i + dx[k];
            int ny = j + dy[k];

            if (nx >= 0 && ny >= 0 && nx < n && ny<n) {
                if (visited[nx][ny] == 0 && arr[nx][ny] > h) {
                    dfs(nx,ny,h);
                }
            }
        }
    }
}
