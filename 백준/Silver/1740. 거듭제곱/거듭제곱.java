

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Long N = Long.parseLong(br.readLine());
        Long ans = 0L;
        Long bit = 1L;

        while (N > 0) {
            if ( (N&1) == 1) {
                ans += bit;
            }
            
            bit *= 3;
            N = N>>1;
        }

        System.out.println(ans);
    }
}
