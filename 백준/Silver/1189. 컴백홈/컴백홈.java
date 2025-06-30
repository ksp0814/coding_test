import java.io.*;
import java.util.*;

public class Main {
    static int r,c,k;
    static int[][] arr;
    static boolean[][] visited;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int ans;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String[] ss = s.split(" ");

        r = Integer.parseInt(ss[0]);
        c = Integer.parseInt(ss[1]);
        k = Integer.parseInt(ss[2]);

        arr = new int[r][c];
        visited = new boolean[r][c];

        for (int i = 0; i < r; i++) {
            String str = br.readLine();
            for (int j = 0; j < c; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        check(r-1,0,1);
        System.out.println(ans);


    }
    static void check(int start_x, int start_y,int dis) {
        if (start_x == 0 && start_y == c-1 && dis == k) {
            ans++;
            return;
        }
        visited[start_x][start_y] = true;


        for (int i =0; i < 4; i++) {
            int nx = start_x + dx[i];
            int ny = start_y + dy[i];

            if (nx >= 0 && nx < r && ny >= 0 && ny < c) {
                if (arr[nx][ny] == '.' && !visited[nx][ny]) {
                    check(nx, ny, dis+1);
                }
            }
        }
        visited[start_x][start_y] = false;

    }
}
