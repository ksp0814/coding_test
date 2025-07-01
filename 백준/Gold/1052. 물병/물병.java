import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        // 같은 양의 물이 들어있는 병끼리 합칠수 있다.

        int ans = 0;

        if (n <= k) {
            System.out.println(0);
            return;
        }

        while(true) {
            if (Integer.bitCount(n) <= k) { // Integer.bitCount()는 n의 이진수에서 1의 개수를 세어준다.
                break;
            }
            n++;
            ans++;
        }

        System.out.println(ans);
    }
}
