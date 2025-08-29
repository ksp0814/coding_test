import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long x = sc.nextLong();
        long y = sc.nextLong();
        long res = 1;

        for (long i = 1; i < x + y + (y == 0 ? 1 : 0); i++) {
            res += 6 * i;
        }

        System.out.println(res + y);
    }
}
