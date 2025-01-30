import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, (a,b) -> {
            if (a.length() != b.length()) {
                return a.length() - b.length();
            }

            int sum1 = resSum(a);
            int sum2 = resSum(b);

            if (sum1 != sum2) {
                return sum1 - sum2;
            }

            return a.compareTo(b);
        });

        for (String s : arr) {
            System.out.println(s);
        }
    }

    private static int resSum(String s) {
        int sum = 0;
        for(char c : s.toCharArray()) {
            if(Character.isDigit(c)) {
                sum += c - '0';
            }
        }
        return sum;
    }
}