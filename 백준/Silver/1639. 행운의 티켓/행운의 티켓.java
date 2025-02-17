

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String n = br.readLine();

        int max = 0;

        int len = n.length();

        for(int i = 2; i<=len; i +=2){
            for(int j = 0; j+i <=len; j++) {
                int leftsum =0; int rightsum = 0;
                for (int x = j; x < j+i/2; x++) {
                    leftsum += n.charAt(x) - '0';
                }
                for (int y = j+i/2; y < j+i; y++) {
                    rightsum += n.charAt(y) - '0';
                }

                if(leftsum == rightsum) {
                    max = Math.max(max,i);
                }
            }
        }
        System.out.println(max);
    }
}
