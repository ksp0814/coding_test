import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int[][] arr = new int[T][5];

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int maxCount = -1;
        int stu = 0;

        for (int i = 0; i < T; i++) {
            int count = 0;
            for (int j = 0; j < T; j++) {
                if (i == j) continue;

                for (int k = 0; k < 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        count++;
                        break;
                    }
                }
            }
            if (count > maxCount) {
                maxCount = count;
                stu = i + 1;
            }
        }

        System.out.println(stu);


    }
}
