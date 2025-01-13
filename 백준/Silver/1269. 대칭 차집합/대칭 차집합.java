

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        String[] num = br.readLine().split(" ");
        List<Integer> A = new ArrayList<>();

        for (String s : num) {
            A.add(Integer.parseInt(s));
        }

        String[] num2 = br.readLine().split(" ");
        List<Integer> B = new ArrayList<>();
        for (String s : num2) {
            B.add(Integer.parseInt(s));
        }

        Collections.sort(A);
        Collections.sort(B);

        int answer = 0;
        int i =0, j =0;
        int count =0;

        while (i<A.size() && j< B.size()) {
            if(A.get(i).equals(B.get(j))){
                count++;
                i++;
                j++;
            } else if (A.get(i) < B.get(j)) {
                i++;
            } else {
                j++;
            }
        }

        answer = (A.size()-count) + (B.size()-count);

        System.out.println(answer);




    }
}
