

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        char[][] friends = new char[N][N];

        for (int i = 0; i < N; i++) {
          friends[i] = br.readLine().toCharArray();
        }

        int maxfirend = 0;

        for (int i = 0; i < N; i++) {
            boolean[] visited = new boolean[N];
            int count = 0;

            for (int j = 0; j < N; j++) {
                if (i == j) continue;

                if (friends[i][j] == 'Y' ) {
                    visited[j] = true;
                    count++;
                } else {
                    for (int k = 0; k < N; k++) {
                        if (friends[i][k] == 'Y' && friends[k][j] == 'Y') {
                            visited[j] = true;
                            count++;
                            break;
                        }
                    }
                }
            }

            maxfirend = Math.max(maxfirend, count);
        }

        System.out.println(maxfirend);
    }
}
