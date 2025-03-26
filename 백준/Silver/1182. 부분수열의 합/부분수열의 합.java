
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, S, count = 0;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i =0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        check(0,0,false);

        System.out.println(count);

    }

    public static void check(int index, int sum, boolean hasSelected) {
        if (index == N) {
            if (sum == S && hasSelected) {
                count++;
            }
            return;
        }

        check(index+1, sum+arr[index], true);

        check(index+1, sum, hasSelected);
    }
}
