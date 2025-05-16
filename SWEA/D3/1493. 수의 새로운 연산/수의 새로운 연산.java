import java.util.Scanner;

class Solution {
    static class Coords {
        int x, y;
        public Coords(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    // 1-기반 좌표 (x,y)로부터 숫자 N 찾기
    public static int getValue(int x, int y) {
        int diag = x + y - 1; // (x+y-2)*(x+y-1)/2 + x 공식 사용 시
        int prevCount = (diag - 1) * diag / 2;
        return prevCount + x;
    }

    // 숫자 N으로부터 1-기반 좌표 (x,y) 찾기
    public static Coords getCoords(int val) {
        int diagBase = 0; 
        // val이 (diagBase)번째 대각선 그룹에 속하도록 diagBase 찾기
        // (diagBase-1)-번째 대각선 그룹까지의 숫자 개수: (diagBase-1)*diagBase/2
        // diagBase-번째 대각선 그룹까지의 숫자 개수: diagBase*(diagBase+1)/2
        while (true) {
            if (diagBase * (diagBase + 1) / 2 >= val) {
                break;
            }
            diagBase++;
        }
        
        int prevCount = (diagBase - 1) * diagBase / 2;
        int x = val - prevCount;
        int y = diagBase - x + 1; // x + y -1 = diagBase  => y = diagBase - x + 1
        return new Coords(x, y);
    }

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int p_val = sc.nextInt();
            int q_val = sc.nextInt();

            Coords coords_p = getCoords(p_val);
            Coords coords_q = getCoords(q_val);

            int new_x = coords_p.x + coords_q.x;
            int new_y = coords_p.y + coords_q.y;

            int result = getValue(new_x, new_y);

            System.out.println("#" + test_case + " " + result);
        }
        sc.close();
    }
}