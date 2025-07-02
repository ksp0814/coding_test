import java.io.*;
import java.util.*;

public class Main {
    static int[] arr;
    static int n;
    static List<Long> list = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        arr = new int[]{9,8,7,6,5,4,3,2,1,0};

        check(0,0);

        Collections.sort(list);

        try {
            System.out.println(list.get(n-1));
        } catch (Exception e) {
            System.out.println(-1);
        }
    }
    static void check(long num,int idx){
        if (!list.contains(num)) {
            list.add(num);
        }

        if (idx >= 10) {
            return;
        }

        check(num * 10 + arr[idx], idx + 1);
        check(num, idx + 1);

    }
}
