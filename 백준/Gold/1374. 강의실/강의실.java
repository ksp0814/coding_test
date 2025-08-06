import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][3]; // 강의실의 번호와 시작시간 종료시간을 담을 배열

        for (int i =0; i < n; i++) {
            int num = sc.nextInt();
            int start = sc.nextInt();
            int end = sc.nextInt();
            arr[i][0] = num;
            arr[i][1] = start;
            arr[i][2] = end;
        }

       // int ans = 1; // 강의실에 갯수

        // 배열에서 arr[i][1] 번째를 기준으로 정렬을 시켜야
        Arrays.sort(arr,(a,b) -> Integer.compare(a[1],b[1]));

        // 종료시간을 담아놀 리스트를 하나 만들어서 그거를 비교하는거지
//        List<Integer> end_list = new ArrayList<>();
//
//        end_list.add(arr[0][2]);
//
//        for (int i =1; i < n; i++) {
//            for (int j =0; j < end_list.size(); j++) {
//                if(arr[i][1] >= end_list.get(j)) {
//                    end_list.set(j, arr[i][2]);
//                    break;
//                } else if (j == end_list.size()-1) {
//                    end_list.add(arr[i][2]);
//                    ans++;
//                    break;
//                }
//            }
//        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(arr[0][2]);

        for (int i =1; i < n; i++) {
            if (arr[i][1] >= pq.peek()) {
                pq.poll();
            }
            pq.add(arr[i][2]);
        }

        System.out.println(pq.size());
    }
}
