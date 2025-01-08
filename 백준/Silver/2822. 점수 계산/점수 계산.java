import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Problem implements Comparable<Problem> {
    int score; // 점수
    int number; // 문제 번호

    public Problem(int score, int number) {
        this.score = score;
        this.number = number;
    }

    @Override
    public int compareTo(Problem other) {
        return Integer.compare(other.score, this.score); // 내림차순 정렬
    }
}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Problem> problems = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            int score = Integer.parseInt(br.readLine());
            problems.add(new Problem(score, i + 1)); // 문제 번호는 1부터 시작
        }

        // 점수 기준으로 내림차순 정렬
        Collections.sort(problems);

        int totalScore = 0;
        List<Integer> includedProblems = new ArrayList<>();

        // 상위 5개 문제의 점수 합산 및 문제 번호 저장
        for (int i = 0; i < 5; i++) {
            totalScore += problems.get(i).score;
            includedProblems.add(problems.get(i).number);
        }

        // 문제 번호를 오름차순으로 정렬
        Collections.sort(includedProblems);

        // 출력
        System.out.println(totalScore);
        for (int problem : includedProblems) {
            System.out.print(problem + " ");
        }
    }
}
