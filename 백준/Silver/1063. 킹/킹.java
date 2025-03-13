

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        String king = input[0];
        String rock = input[1];
        int N = Integer.parseInt(input[2]);

        int king_col = king.charAt(0) - 'A';
        int king_row = 8 - (king.charAt(1) - '0');

        int rock_col = rock.charAt(0) - 'A';
        int rock_row = 8 - (rock.charAt(1) - '0');

        String[] moves = {"R", "L", "B", "T", "RT", "LT", "RB", "LB"};
        int[] dx = {0, 0, 1, -1, -1, -1, 1, 1};
        int[] dy = {1, -1, 0, 0, 1, -1, 1, -1};

        for (int i = 0; i < N; i++) {
            String move = br.readLine();

            int moveIndex = -1;
            for (int j = 0; j < moves.length; j++) {
                if (move.equals(moves[j])) {
                    moveIndex = j;
                    break;
                }
            }

            int next_king_row = king_row + dx[moveIndex];
            int next_king_col = king_col + dy[moveIndex];

            if (next_king_row < 0 || next_king_row >= 8 || next_king_col < 0 || next_king_col >= 8)
                continue;

            if (next_king_row == rock_row && next_king_col == rock_col) {
                int next_rock_row = rock_row + dx[moveIndex];
                int next_rock_col = rock_col + dy[moveIndex];

                if (next_rock_row < 0 || next_rock_row >= 8 || next_rock_col < 0 || next_rock_col >= 8)
                    continue;

                rock_row = next_rock_row;
                rock_col = next_rock_col;
            }

            king_row = next_king_row;
            king_col = next_king_col;
        }

        char king_col_char = (char) ('A' + king_col);
        char king_row_char = (char) ('8' - king_row);
        char rock_col_char = (char) ('A' + rock_col);
        char rock_row_char = (char) ('8' - rock_row);

        System.out.println("" + king_col_char + king_row_char);
        System.out.println("" + rock_col_char + rock_row_char);
    }
}
