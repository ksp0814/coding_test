
import java.util.*;
import java.io.*;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		        Scanner sc = new Scanner(System.in);

        int T  = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {

            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            int[] list = new int[11111];

            int[] person = new int[n];

            for (int i = 0; i < n; i++) {
                person[i] = sc.nextInt();
            }
            Arrays.sort(person);

            int x = 0;

            for (int i = 1; i < 11111; i++) {
                if(i % m == 0) {
                    x += k;
                    list[i] = x;
                } else list[i] = x;
            }

            boolean check = true;

            for (int i = 0; i < n; i++) {
                if (list[person[i]] >= i +1) {
                    check = true;
                } else {check = false;
                break;}
            }

            if(check) {
            System.out.println("#" + test_case + " Possible");
            } else {
                System.out.println("#" + test_case + " Impossible");
            }

}
}
}