
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int N = Integer.parseInt(br.readLine());

         int[] list = new int[N];

         for (int i = 0; i < N; i++) {
             int n = Integer.parseInt(br.readLine());
             list[i] = n;
         }

        Arrays.sort(list);

         int min = 5;

         for(int i = 0; i < N; i++){
             int count = 1;
             for (int j = i+1; j < N; j++){
                 if (list[j] - list[i] < 5){
                     count++;
                 } else{
                     break;
                 }
             }
             min = Math.min(min, 5 - count);
         }
        System.out.println(min);
    }
}
