import java.util.Scanner;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int H = sc.nextInt();
            int W = sc.nextInt();

            char[][] list = new char[H][W];

            int x = 0;
            int y = 0;
            for (int i = 0; i < H; i++) {
                String line = sc.next();
                for (int j = 0; j < W; j++) {
                    list[i][j] = line.charAt(j);
                    if (list[i][j] == '^' || list[i][j] == 'v' || list[i][j] == '>' || list[i][j] == '<') {
                        x = i;
                        y = j;
                    }
                }
            }
            
            int N = sc.nextInt();
            char[] ans = new char[N];

            String answer = sc.next();
            for (int i = 0; i < N; i++) {
                ans[i] = answer.charAt(i);
                if (ans[i] == 'U') {
                    list[x][y] = '^';
                    if (x > 0 && list[x - 1][y] == '.') {
                        list[x - 1][y] = '^';
                        list[x][y] = '.';
                        x = x - 1;
                    }
                } else if (ans[i] == 'D') {
                    list[x][y] = 'v';
                    if (x + 1 < H && list[x + 1][y] == '.') {
                        list[x + 1][y] = 'v';
                        list[x][y] = '.';
                        x = x + 1;
                    }
                } else if (ans[i] == 'L') {
                    list[x][y] = '<';
                    if (y > 0 && list[x][y - 1] == '.') {
                        list[x][y - 1] = '<';
                        list[x][y] = '.';
                        y = y - 1;
                    }
                } else if (ans[i] == 'R') {
                    list[x][y] = '>';
                    if (y + 1 < W && list[x][y + 1] == '.') {
                        list[x][y + 1] = '>';
                        list[x][y] = '.';
                        y = y + 1;
                    }
                } else if (ans[i] == 'S') {
                    if (list[x][y] == '>') {
                        for (int k = y + 1; k < W; k++) {
                            if (list[x][k] == '*') {
                                list[x][k] = '.';
                                break;
                            } else if (list[x][k] == '#') {
                                break;
                            }
                        }
                    } else if (list[x][y] == '<') {
                        for (int k = y - 1; k >= 0; k--) {
                            if (list[x][k] == '*') {
                                list[x][k] = '.';
                                break;
                            } else if (list[x][k] == '#') {
                                break;
                            }
                        }
                    } else if (list[x][y] == '^') {
                        for (int k = x - 1; k >= 0; k--) {
                            if (list[k][y] == '*') {
                                list[k][y] = '.';
                                break;
                            } else if (list[k][y] == '#') {
                                break;
                            }
                        }
                    } else if (list[x][y] == 'v') {
                        for (int k = x + 1; k < H; k++) {
                            if (list[k][y] == '*') {
                                list[k][y] = '.';
                                break;
                            } else if (list[k][y] == '#') {
                                break;
                            }
                        }
                    }
                }
            }

            System.out.print("#" + test_case + " ");
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    System.out.print(list[i][j]);
                }
                System.out.println();
            }
        }
    }
}
