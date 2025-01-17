import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        String N = input[0];
        String M = input[1];
        
        int mindif = Integer.MAX_VALUE;
        for (int i = 0; i <= M.length() - N.length(); i++) {
            int dif = 0;
            for (int j = 0; j < N.length(); j++) {
                if (N.charAt(j) != M.charAt(i + j)) {
                    dif++;
                }
            }
            mindif = Math.min(mindif, dif);
        }
        System.out.println(mindif);
    }
}
