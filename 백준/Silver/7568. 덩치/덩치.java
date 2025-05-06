import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] list = new int[n][2];

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            list[i][0] = Integer.parseInt(st.nextToken());
            list[i][1] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < n; i++){
            int rank = 1;
            for(int j = 0; j < n; j++){
                if( i == j) {
                    continue;
                }

                if(list[i][0] < list[j][0] && list[i][1] < list[j][1]) {
                    rank++;
                }
            }

            System.out.print(rank + " ");
        }

    }
}
