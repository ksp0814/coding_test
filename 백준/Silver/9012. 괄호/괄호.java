

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            int count = 0;
            boolean check = true;
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == '(') {
                    count++;
                } else if (c == ')') {
                    count--;
                }
                
                if (count < 0) {
                    check = false;
                    break;
                }
            }

            if (check && count == 0) {
                System.out.println("YES");
            } else System.out.println("NO");
        }
    }
}
