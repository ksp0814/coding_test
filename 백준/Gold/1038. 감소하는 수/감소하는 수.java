import java.io.*;
import java.util.*;


public class Main {
    static List<Long> list;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        list = new ArrayList<>();

        if (n < 10) {
            System.out.println(n);
            return;
        } else if (n > 1022) {
            System.out.println("-1");
            return;
        }

        for (int i =0; i < 10; i++ ) {
            dfs(1,i);
        }

        Collections.sort(list);
        System.out.println(list.get(n));

    }

    static void  dfs( int idx, long num) {
        if (idx > 10){
            return;
        }
        list.add(num);

        for (int i = 0; i < num % 10; i++) {
            dfs(idx+1, num * 10 + i);
        }
    }
}
