
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int ans = Integer.parseInt(br.readLine());
        int count = 1;
        int x = 1;

        while (ans > x) {
            x += 6 * count;
            count++;
        }


        System.out.println(count);

        }
    }

