import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            if (maxim(a,b,c)){
                System.out.println("Invalid");
            } else if (a == b && a ==c){
                System.out.println("Equilateral");
            } else if ( a==b || b==c || c==a ) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }


        }
    }

    static boolean maxim(int a, int b, int c) { // 삼각형 조건을 만족하는지
        return (a + b <= c) || (a + c <= b) || (b + c <= a);
    }
}
