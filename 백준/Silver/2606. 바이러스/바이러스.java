import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    static int n;
    static int[][] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> queue = new LinkedList<>();
        n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        graph = new int[n+1][n+1];
        visited = new boolean[n+1];
        for (int i = 0; i < m; i++) {
            String[] s = br.readLine().split(" ");

            graph[Integer.parseInt(s[0])][Integer.parseInt(s[1])] = 1;
            graph[Integer.parseInt(s[1])][Integer.parseInt(s[0])] = 1;
        }
        queue.add(1);
        visited[1] = true;
        int cnt = 0;
        while (!queue.isEmpty()) {
            int x = queue.poll();
            for (int i = 1; i <= n; i++) {
                if (graph[x][i] == 1 && visited[i] == false) {
                    queue.add(i);
                    visited[i] = true;
                    cnt++;
                }
            }
        }

        System.out.println(cnt);

        
    }
}
