import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int count;
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        graph = new ArrayList[n+1];
        visited = new boolean[n+1];

        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i =0; i<m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u].add(v);
            graph[v].add(u);
        }

        count =0;
        for (int i =1; i<=n; i++) {
            if(!visited[i]) {
                count++;
                dfs(i);
            }
        }
        System.out.println(count);
    }

    static void dfs(int node) {
        visited[node] = true;
        for (int next : graph[node]) {
            if (!visited[next]){
                dfs(next);
            }
        }
    }
}
