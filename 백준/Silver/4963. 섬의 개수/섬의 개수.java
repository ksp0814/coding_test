import java.util.Scanner;

public class Main {
    static int[] dx = { -1, 1, 0, 0, -1, -1, 1, 1}; // 상하좌우 대각선 까지
    static int[] dy = { 0, 0, -1, 1, -1, 1, -1, 1};
    static int ans;
    static int[][] arr;
    static boolean[][] visited;
    static int w,h;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            w = sc.nextInt();
            h = sc.nextInt();

            if (w == 0 && h == 0) {
                break;
            }

            arr = new int[h][w];
            visited = new boolean[h][w];

            ans = 0;

            for (int i = 0; i < h ; i++) {
                for (int j = 0; j < w; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < h; i++) {
                for (int j =0; j < w; j++) {
                    if (arr[i][j] == 1 && !visited[i][j]) {
                        check(i,j);
                        ans++;
                    }
                }
            }

            System.out.println(ans);


        }
    }
    static void check(int startx, int starty) {
        visited[startx][starty] = true;

        for (int i = 0; i < 8; i++) {
            int nx = startx + dx[i];
            int ny = starty + dy[i];

            if (nx >= 0 && ny >= 0 && nx < h && ny < w) {
                if (arr[nx][ny] == 1 && !visited[nx][ny]) {
                    check(nx, ny);
                }
            }
        }
    }
}
