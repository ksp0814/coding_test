import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        long s = sc.nextLong();
        long n = 0;

        int count =0;

        for(int i =1; ; i++) {
            if(n + i  > s) break;
            n += i;
            count++;
        }


        System.out.println(count);


    }
}
