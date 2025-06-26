import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int ans = s.length();

        for (int i =0; i < s.length(); i++) {

            if (check(s.substring(i))) {
                break;
            }
            ans++;
        }
        System.out.println(ans);
    }

    public static boolean check(String s) {
        int left =0;
        int right = s.length()-1;

        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
