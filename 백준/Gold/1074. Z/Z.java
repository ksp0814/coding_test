import java.io.IOException;
import java.util.Scanner;

public class Main {
    static int count = 0;
    static int r,c;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        r = sc.nextInt();
        c = sc.nextInt();

        int t = (int) Math.pow(2,n);

        check(0,0,t);
        System.out.println(count);

    }

    static void check(int x, int y , int t){
        if( t == 1) return;

        int tmp = t/2;

        if(r < x + tmp && c < y + tmp) {
            check(x,y,tmp);
        } else if (r < x + tmp && c >= y + tmp ) {
            count += tmp*tmp;
            check(x, y+tmp, tmp);
        } else if (r >= x+tmp && c < y + tmp) {
            count += 2 * tmp * tmp;
            check(x+tmp,y,tmp);
        } else {
            count += 3 * tmp * tmp;
            check(x+tmp, y+tmp, tmp);
        }
    }
}
