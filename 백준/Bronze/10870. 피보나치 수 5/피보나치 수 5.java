import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        System.out.println(check(n));
    }

    static int check(int x) {
        if (x == 0 )return 0;
        if (x == 1 )return 1;

        int a =0;
        int b =1;
        int sum = 0;

        for (int i = 2 ; i<=x; i++){
            sum = a+b;
            a = b;
            b = sum;
        }
        return b;
    }
}
