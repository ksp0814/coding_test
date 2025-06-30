import java.io.*;
import java.util.*;

public class Main {
    static int x,y,w,h;
    static int[][] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        String[] ss = s.split(" ");

        x = Integer.parseInt(ss[0]);
        y = Integer.parseInt(ss[1]);
        w = Integer.parseInt(ss[2]);
        h = Integer.parseInt(ss[3]);

//        arr = new int[w][h];
//
//        // 현재 위치가 (x,y)
//        // 직사각형의 크기가 (w,h)
//        // 현재 위치에서 직사각형의 경계선까지 가는 거리의 최솟값을 구한다.
//
//        int min = Math.min(x,y);
//        int min2 = Math.min(w,h);
//
//        int ans1 = Math.max(min, min2) - Math.min(min,min2);
//
//        int max = Math.max(x,y);
//        int max2 = Math.max(w,h);
//
//        int ans2 = Math.max(max,max2) - Math.min(max,max2);
//
//        int ans3 = Math.min(x,y);
//
//        int result = Math.min(ans1, Math.min(ans2, ans3));
//        System.out.println(result);

        int result = Math.min(Math.min(x, w-x), Math.min(y, h-y));
        System.out.println(result);

    }
}
