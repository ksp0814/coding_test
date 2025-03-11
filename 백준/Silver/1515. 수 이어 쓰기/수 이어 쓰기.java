import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String c = br.readLine();
        List<Character> list = new ArrayList<>();

        for (int i = 0; i < c.length(); i++) {
            list.add(c.charAt(i));
        }


        int idx = 0; // 비교 하는 인덱스
        int num = 1; // 1부터 증가시키면서 탐색

        while (idx < list.size()) {
            String s = String.valueOf(num);

            for (int i = 0; i< s.length(); i++) {
                if (idx < list.size() && s.charAt(i) == list.get(idx)) {
                    idx++;
                }
            }
            num++;
        }

        System.out.println(num -1);


    }
}
