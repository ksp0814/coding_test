import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        String[] part = s.split(" ");

        List<Integer> nums = new ArrayList<>();

        for (String num : part) {
            nums.add(Integer.parseInt(num));
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= nums.get(1); i++) {
            for (int j = 0; j < i; j++) {
                result.add(i);
            }
        }

        int sum = 0;
        for (int i = nums.get(0) -1; i< nums.get(1); i++){
            sum += result.get(i);
        }

        System.out.println(sum);

    }
}
