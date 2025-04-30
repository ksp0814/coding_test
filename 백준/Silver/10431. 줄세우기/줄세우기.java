

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int testCase = Integer.parseInt(st.nextToken()); // 테스트 케이스 번호
            int[] arr = new int[20];

            for (int j = 0; j < 20; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            int count = 0;
            for (int j = 1; j < 20; j++) {
                int cur = arr[j];
                int k = j;
                while (k > 0 && arr[k - 1] > cur) {
                    arr[k] = arr[k - 1];
                    k--;
                    count++;
                }
                arr[k] = cur;
            }

            System.out.println(testCase + " " + count);
        }
    }
}
