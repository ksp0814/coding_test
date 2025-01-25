import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        String[] parts = s.split(" ");

        int N = Integer.parseInt(parts[0]);
        int K = Integer.parseInt(parts[1]);

        StringBuilder sb = new StringBuilder();

        Queue<Integer> q = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            q.offer(i);
        }

        sb.append("<");

        while(q.size() != 1) {
            for(int i = 0; i < K - 1; i++) {
                q.offer(q.poll());
            }
            sb.append(q.poll()).append(", ");
        }

        sb.append(q.poll()).append(">");
        System.out.println(sb);
    }
}
