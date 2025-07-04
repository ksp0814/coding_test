import java.util.*;
import java.io.*;

public class Main {
    static int[] arr;
    static boolean[] visited;

    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        visited = new boolean[n];
        arr = new int[m];

        dfs(n,m,0);

    }

    static void dfs(int n, int m ,int depth) {
        if (depth == m) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                arr[depth] = i + 1;
                dfs(n, m, depth + 1);
                visited[i] = false;
            }
        }
    }
}
