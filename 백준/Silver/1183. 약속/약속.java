import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] T = new int[n];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            T[i] = b - a;
        }

        Arrays.sort(T);

        if ( n % 2 == 1) {
            System.out.println(1);
        } else {
            int first_mid = T[n/2 -1];
            int second_mid = T[n/2];
            System.out.println(second_mid - first_mid + 1);
        }



    }
}
