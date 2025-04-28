

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = 1000;
        int N = Integer.parseInt(br.readLine());

        int[] money = {500,100,50,10,5,1};

        int count =0;
        M -= N; // 이제 M이 잔액이 남는다.

        for (int coin : money) {
            if (M >= coin) {
                count += M/coin;
                M %= coin;
            }
        }
        System.out.println(count);
    }
}
