import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            String[] word = input.split(" ");

            for (int j = 0; j < word.length; j++) {
                sb.append(new StringBuilder(word[j]).reverse().toString()).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}