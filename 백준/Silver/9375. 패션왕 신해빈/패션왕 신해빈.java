import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         int T = Integer.parseInt(br.readLine());

         for (int i = 0; i < T; i++) {

             int N = Integer.parseInt(br.readLine());
             HashMap<String, Integer> hash = new HashMap<>();

             for (int j = 0; j < N; j++) {
                 StringTokenizer st = new StringTokenizer(br.readLine());
                 st.nextToken();

                 String type = st.nextToken();
                 hash.put(type, hash.getOrDefault(type, 0) + 1);
             }

             int ans = 1;
             for (int val : hash.values())
                 ans *= val + 1;
             bw.write(String.valueOf(ans - 1));
             bw.newLine();

         }
         bw.flush();
         bw.close();
    }
}