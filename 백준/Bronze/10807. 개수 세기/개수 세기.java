
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>(N);

        String[] input = br.readLine().split(" ");

        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(input[i]));
        }

        int V = Integer.parseInt(br.readLine());

        int count = 0;

        for (int i = 0; i < N; i++) {
            if (list.get(i) == V) {
                count++;
            }
        }

        System.out.println(count);


    }
}
