import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());

        HashMap<String, Integer> carstart = new HashMap<>();
        List<String> carend = new ArrayList<>();

        // 차량 입구 순서 기록
        for (int i = 0; i < tc; i++) {
            String car = sc.nextLine();
            carstart.put(car, i);
        }

        // 차량 출구 순서 기록
        for (int i = 0; i < tc; i++) {
            String car = sc.nextLine();
            carend.add(car);
        }

        int count = 0;
        boolean[] passed = new boolean[tc]; // 해당 순번의 차량이 지나갔는지를 확인하는 배열

        for (int i = 0; i < tc; i++) {
            int curPos = carstart.get(carend.get(i));

            // 앞에 위치한 차량들이 뒤에 있는지 확인
            for (int j = 0; j < curPos; j++) {
                if (!passed[j]) {
                    count++;
                    break;
                }
            }

            passed[curPos] = true; // 현재 차량의 출구 통과 처리
        }

        System.out.println(count);
    }
}