

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] zero = new int[n];
        String[] lamp = new String[n];

        for(int i = 0; i < n; i++) {
            String s =sc.next();
            lamp[i] = s;
            for(int j = 0; j < m; j++) {
                if (s.charAt(j) == '0') zero[i]++;
            }
        }

        int k = sc.nextInt();

        int answer = 0;

        for(int i = 0; i< n; i++) {
            if(zero[i] <= k && (zero[i] - k) % 2 == 0) { // 스위치를 2번 누르면 원래 상태로 돌아오니까
                int row = 1;
                for(int j = 0; j< n; j++) {
                    if( j==i) continue;

                    if(lamp[i].equals(lamp[j])) {
                        row++;
                    }
                }
                answer = Math.max(answer, row);
            }
        }

        System.out.println(answer);
    }
}
