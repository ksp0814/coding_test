
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<String> list = new ArrayList<>();

        String ans = "";

        for (int i = 0; i < N; i++) {
            list.add(br.readLine());
        }

        String s = list.get(0);

        for (int i =0; i < s.length(); i++) {
            int count =0;
            char c = s.charAt(i);
            for (int j = 1; j < N; j++) {
                if (c == list.get(j).charAt(i)) {
                   count++;
                }
            }
            if (count == N-1) {
                ans += c;
            } else ans += "?";
        }

        System.out.println(ans);

    }
}
