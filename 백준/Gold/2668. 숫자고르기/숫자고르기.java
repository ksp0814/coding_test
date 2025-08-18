import java.util.*;

public class Main {
    static int n;
    static int[] arr;
    static boolean[] visited;
    static List<Integer> list;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        arr = new int[n+1];
        visited = new boolean[n+1];
        list = new ArrayList<>();

        for (int i =1; i<=n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i =1; i <= n; i++) {
            visited[i] = true;
            check(i,i);
            visited[i] = false;
        }

        Collections.sort(list);
        System.out.println(list.size());
        for (int an : list) {
            System.out.println(an);
        }

    }

    static void check(int start, int tar) {
        if (!visited[arr[start]]) {
            visited[arr[start]] = true;
            check(arr[start], tar);
            visited[arr[start]] = false;
        }

        if (arr[start] == tar) {
            list.add(tar);
        }
    }
}
