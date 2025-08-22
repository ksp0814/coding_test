import java.util.Scanner;

public class Main {
    static int R, C;
    static char[][] arr;
    static int[] dx = {-1,1,0,0}; //상하좌우
    static int[] dy = {0,0,-1,1};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        R = sc.nextInt();
        C = sc.nextInt();

        arr = new char[R][C];

        for (int i = 0; i < R; i++) {
            String s = sc.next();
            for (int j = 0; j < C; j++) {
                arr[i][j] = s.charAt(j);
            }
        }


        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (arr[i][j] == 'W') {
                    for (int k = 0; k<4; k++) {
                        int nx = i+dx[k];
                        int ny = j+dy[k];
                        if (nx >= 0 && nx < R && ny >= 0 && ny < C) {
                            if (arr[nx][ny] == 'S') {
                                System.out.println(0);
                                return;
                            } else if (arr[nx][ny] == '.') {
                                arr[nx][ny] = 'D';
                            }
                        }
                    }
                }
            }
        }

        System.out.println(1);
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
