
import com.sun.jdi.LongType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
        Long[][] arr = new Long[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Long.parseLong(st.nextToken());
                pq.add(arr[i][j]);
            }
        }

        for (int i = 0; i < N-1; i++) {
            pq.remove();
        }

        System.out.println(pq.poll());
    }
}
