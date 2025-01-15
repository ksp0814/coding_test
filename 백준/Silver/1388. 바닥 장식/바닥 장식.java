import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static int N,M;
    static char[][] arr;
    static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new char[N][M];
        visited = new boolean[N][M];

        for ( int i = 0; i < N; i++ ) {
            String str = br.readLine();
            for ( int j = 0; j < M; j++ ) {
                arr[i][j] = str.charAt(j);
        }
    }

    int cnt = 0;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (!visited[i][j]) { // 방문하지 않은 칸이면
                    if (arr[i][j] == '-') {
                        dfs(i, j, true); // 수평 탐색
                    } else {
                        dfs(i, j, false); // 수직 탐색
                    }
                    cnt++; // 새로운 나무 판자 발견
                }
            }
        }

    System.out.println(cnt);

    }

    private static void dfs(int x, int y, boolean isVisited) {
        visited[x][y] = true;
        if(isVisited) {
            y++;
            if (y<M && arr[x][y] == '-') dfs(x,y,true);
        }
        else {
            x++;
            if (x<N && arr[x][y] == '|') dfs(x,y,false);
        }
    }
}
