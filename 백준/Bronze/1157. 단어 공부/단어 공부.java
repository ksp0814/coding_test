import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().toUpperCase(); // toUpperCase를 적용해서 대문자로 인식
        int[] arr = new int[26]; // A-Z

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            arr[c-'A']++;
        }

        int maxCount = 0;

       char result = '?';
       for (int i = 0; i < 26; i++) {
           if (arr[i] > maxCount) {
               maxCount = arr[i];
               result = (char) (i+'A');
           } else if (arr[i] == maxCount) {
               result = '?';
           }
       }

        System.out.println(result);
    }
}
