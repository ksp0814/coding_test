import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[][] A = new int[N][2];


        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i][0] = Integer.parseInt(st.nextToken());
            A[i][1] = i;
        }

        Arrays.sort(A, (o1, o2) -> Integer.compare(o1[0], o2[0]));

        int[] P = new int[N];

        for (int i = 0; i < N; i++) {
            P[A[i][1]] = i;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            sb.append(P[i]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
