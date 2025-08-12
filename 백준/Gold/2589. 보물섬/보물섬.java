import java.util.*;

public class Main {
    static char[][] arr;
    static boolean[][] visited;
    static int[] dx = {0,-1,0,1}; // 상하좌우
    static int[] dy = {-1,0,1,0};
    static int ans;
    static int n, p;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        p = sc.nextInt();
        sc.nextLine();

        arr = new char[n][p]; // W = 바다, L = 육지

        ans = 0;

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            for (int j =0; j < s.length(); j++) {
                arr[i][j] = s.charAt(j);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                if(arr[i][j] == 'L') {
                    visited = new boolean[n][p];
                    ans = Math.max(ans,check(i,j));
                }
            }
        }

        System.out.println(ans);
    }

    static int check(int startx, int starty) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{startx,starty,0});
        visited[startx][starty] = true;

        int maxDist = 0;

        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];
            int dist = cur[2];

            if (dist > maxDist) {
                maxDist = dist;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < n && ny >= 0 && ny < p){
                    if (!visited[nx][ny] && arr[nx][ny] == 'L') {
                        visited[nx][ny] = true;
                        queue.offer(new int[]{nx,ny,dist+1});
                    }
                }
            }
        }
        return maxDist;
    }
}
