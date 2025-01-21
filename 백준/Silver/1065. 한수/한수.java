
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int ans = 0;

        for (int i = 1; i <= N; i++) {
            if (i/100 == 0)
                ans++;

            else if (i/1000 == 0) {
                int ooo = i/100;
                int oo = (i%100) /10;
                int o = i%10;

                if ( ooo - oo == oo - o)
                    ans++;
            }
        }
        System.out.println(ans);
    }
}
