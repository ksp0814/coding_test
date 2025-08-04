import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 합
        int l = sc.nextInt(); // 최소 길이

        while(true) {
            int len = n/l - (l-1)/2;
            if (len < 0 || l > 100) {
                System.out.println(-1);
                break;
            }
            int sum = (len*2+l-1)*l/2;

            if(sum == n) {
                for (int i = 0; i< l; i++) {
                    System.out.print((len+i) + " ");
                }
                break;
            }
            l++;
        }

    }
}
