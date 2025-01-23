
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        ArrayList<String>[] arr = new ArrayList[N];

        int ans = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = new ArrayList<>();
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                arr[i].add(s.substring(j) + s.substring(0, j));
            }
            boolean check = true;
            for (int j =0; check && j <= i-1; j++) {
                for (int k = 0; check && k < arr[j].size(); k++) {
                    if (s.equals(arr[j].get(k))) check = false;
                }
            }

            if (check) ans++;
        }
        System.out.println(ans);
    }
}
