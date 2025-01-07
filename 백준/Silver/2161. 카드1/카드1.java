import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= T; i++) {
            list.add(i);
        }

        while(list.size() > 1) {
            System.out.print(list.get(0) + " ");
            list.remove(0);
            
            if (list.size() > 1) {
                int temp = list.remove(0);
                list.add(temp);
            }
        }
        System.out.print(list.get(0));
    }
}