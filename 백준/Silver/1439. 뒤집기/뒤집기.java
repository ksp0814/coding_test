import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int count = 0;

        char str = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {
            if (str != s.charAt(i)) {
                str = s.charAt(i);
                count++;
            }
        }

        System.out.println((count / 2) + count % 2);
    }
}
