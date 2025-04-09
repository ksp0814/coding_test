
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int N;
    static int[][] apartment;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        apartment = new int[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            String s =br.readLine();
            for (int j = 0; j < N; j++) {
                apartment[i][j] = s.charAt(j) - '0';
            }
        }

        int dong = 0;
        List<Integer> houseCounts = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (apartment[i][j] == 1 && !visited[i][j]) {
                    count =0;
                    dfs(i,j);
                    dong++;
                    houseCounts.add(count);
                }
            }
        }

        Collections.sort(houseCounts);

        System.out.println(dong);
        for (int house : houseCounts) {
            System.out.println(house);
        }
    }

    static void dfs(int i, int j)  { // i,j를 통해서 시작점을 주는거야
        visited[i][j] = true;
        count++;

        for (int k = 0; k < 4; k++) {
            int nx = i + dx[k];
            int ny = j + dy[k];

            if (nx >= 0 && nx < N && ny >= 0 && ny < N) {
                if (apartment[nx][ny] == 1 && !visited[nx][ny]) {
                    dfs(nx, ny);
                }
            }
        }
    }
}
