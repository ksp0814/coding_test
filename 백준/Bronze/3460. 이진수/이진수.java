import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();


        for (int i = 0; i < tc; i++) {

            int temp = sc.nextInt();

            if (temp == 0) {
                System.out.println("0");
                continue;
            }
            StringBuilder sb = new StringBuilder();

            while ( temp > 0) {
                int mod = temp % 2;
                sb.append(mod);
                temp /= 2;
            }

            for (int j = 0; j < sb.length(); j++) {
                if (sb.charAt(j) == '1') {
                    System.out.print(j + " ");
                }
            }

        }
    }
}
