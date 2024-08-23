

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Read the input as a string
        String[] input = reader.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        List<Integer> List2 = new ArrayList<>();
        String[] input1 = reader.readLine().split(" ");
        for (String number : input1) {
            List2.add(Integer.parseInt(number));
        }

        String[] input2 = reader.readLine().split(" ");
        for (String number : input2) {
            List2.add(Integer.parseInt(number));
        }

        // Sort and remove duplicates
        Collections.sort(List2);

        StringBuilder sb = new StringBuilder();
        // Print the distinct and sorted list
        for ( int i =0; i < List2.size();i++){
            sb.append(List2.get(i) + " ");
        }
        System.out.println(sb);
    }
}
