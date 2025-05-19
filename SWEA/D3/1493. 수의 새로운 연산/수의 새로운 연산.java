
import java.util.Scanner;
import java.io.FileInputStream;


class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int[][] list = new int[300][300];

        list[0][0] = 1;
        for (int i =1; i < 300; i++) {
            list[i][0] = list[i-1][0] + i;
        }

        for (int i = 0; i <300; i++) {
            for (int j = 1; j <300; j++) {
                list[i][j] = list[i][j-1] + (i+j+1);
            }
        }


        for (int test_case = 1; test_case <= T; test_case++) {

            int p = sc.nextInt();
            int q = sc.nextInt();
            int x=0;
            int y=0;
            int z=0;
            int w=0;

            for (int i = 0; i < 300; i++) {
                for (int j = 0; j < 300; j++) {
                    if(list[i][j] == p) {
                        x = i;
                        y = j;
                    }
                    if (list[i][j] == q) {
                        z = i;
                        w = j;
                    }
                }
            }

            int a = x+z +1;
            int b = y+w +1;

            System.out.println("#" + test_case +" " + list[a][b]);
		

		}
	}
}