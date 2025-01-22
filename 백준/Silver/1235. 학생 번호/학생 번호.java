import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i <= arr[0].length(); i++) {
            for (int j = 0; j < N; j++) {
                set.add(arr[j].substring(arr[0].length() - i));
            }
            if (set.size() == N) {
                System.out.println(i);
                break;
            }
            set.clear();
        }
    }
}
