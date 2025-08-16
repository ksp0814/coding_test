import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    static int n;
    static int[][] arr;
    static int[][] dist;
    static int[] dx = {-1,0,1,0}; //
    static int[] dy = {0,1,0,-1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        sc.nextLine();

        arr = new int[n][n];
        dist = new int[n][n];

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.charAt(j) - '0';
                dist[i][j] = Integer.MAX_VALUE;
            }
        }

        check();
        System.out.println(dist[n-1][n-1]);
    }

    static void check() {
        Deque<int[]> dq = new ArrayDeque<>();
        dq.add(new int[]{0,0});
        dist[0][0] = 0;

        while (!dq.isEmpty()) {
            int[] cur = dq.poll();
            int x = cur[0];
            int y = cur[1];

            for (int i =0; i< 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || ny < 0 || nx >= n || ny >= n) continue;

                if (arr[nx][ny] == 1 && dist[nx][ny] > dist[x][y]) {
                    dist[nx][ny] = dist[x][y];
                    dq.addFirst(new int[]{nx, ny});
                } else if (arr[nx][ny] == 0 && dist[nx][ny] > dist[x][y] + 1) {
                    dist[nx][ny] = dist[x][y] + 1;
                    dq.addLast(new int[]{nx,ny});
                }
            }
        }
    }
}
