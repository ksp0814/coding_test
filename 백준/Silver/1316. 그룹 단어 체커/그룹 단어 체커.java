import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int count = n;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            int before = 0;


            // 알파벳 26개
            int[] s = new int[26];

            for(int j = 0; j < str.length(); j++) {
                int now = str.charAt(j);

                if (before != now) {
                    if (s[now - 97] == 0) {
                        s[now - 97]++;
                        before = now;
                    } else {
                        count--;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
