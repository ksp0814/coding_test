

import java.io.IOException;
import java.util.Scanner;

public class Main {
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,1,-1};
    static int[][] list;
    static boolean[][] visited;
    static int m,n;
    static int ans;
    public static void main(String[] args) throws IOException {
        Scanner sc  = new Scanner(System.in);

        int t = sc.nextInt();

        for (int test_case = 0; test_case < t; test_case++) {
            m = sc.nextInt();
            n = sc.nextInt();
            int k = sc.nextInt();

            list = new int[m][n];
            visited = new boolean[m][n];

            for (int i = 0; i < k; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                list[x][y] = 1;
            }
            ans = 0;
            
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (list[i][j] == 1 && !visited[i][j]) {
                        check(i, j);
                        ans++;
                    }
                }
            }
            System.out.println(ans);

        }
    }
    static void check (int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            
            if(nx >= 0 && ny >= 0 && nx < m && ny < n) {
                if (list[nx][ny] == 1 && !visited[nx][ny]) {
                    check(nx, ny);
                }
            }
        }
    }
}
