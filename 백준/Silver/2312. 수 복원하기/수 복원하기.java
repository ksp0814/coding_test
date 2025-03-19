

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());

            for (int j = 2; j * j <= n; j++) {
                int count = 0;

                while (n % j == 0) {
                    count++;
                    n /= j;
                }

                if (count > 0) {
                    System.out.println(j + " " + count);
                }
            }

            // 소수 하나가 마지막에 남는 경우
            if (n > 1) {
                System.out.println(n + " 1");
            }
        }
    }
}
