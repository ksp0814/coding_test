import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int k = sc.nextInt();

        int na = s / k;  // 몫
        int per = s % k; // 나머지

        long ans = 1;

        for (int i = 0; i < k - per; i++) {
            ans *= na;
        }
        

        for (int i = 0; i < per; i++) {
            ans *= (na + 1);
        }
        
        System.out.println(ans);
    }
}
