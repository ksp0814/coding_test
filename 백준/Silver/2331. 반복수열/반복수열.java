import java.io.*;
import java.util.*;

public class Main {

    static int P;
    static ArrayList<Integer> sequence = new ArrayList<>();
    static HashMap<Integer, Integer> indexMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        P = Integer.parseInt(st.nextToken());

        int result = findCycleLength(A);
        System.out.println(result);
    }

    static int findNextNumber(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, P);
            num /= 10;
        }
        return sum;
    }

    static int findCycleLength(int A) {
        int index = 0;
        int current = A;

        while (!indexMap.containsKey(current)) {
            indexMap.put(current, index);
            sequence.add(current);
            current = findNextNumber(current);
            index++;
        }

        return indexMap.get(current);
    }
}
