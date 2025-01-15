import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        //List<Integer> list = new ArrayList<>();
        //List<Integer> list1 = new ArrayList<>();
        int[] list1 = new int[n];
        int[] list2 = new int[n];


        String[] input1 = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            list1[i] = Integer.parseInt(input1[i]);
        }
        Arrays.sort(list1);

        String[] input2 = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            list2[i] = Integer.parseInt(input2[i]);
        }

        Arrays.sort(list2);

        int ans = 0;
        for (int i = 0; i <n; i++) {
            ans += (list1[i] * list2[n - i -1]);
        }

        System.out.println(ans);


    }

}
