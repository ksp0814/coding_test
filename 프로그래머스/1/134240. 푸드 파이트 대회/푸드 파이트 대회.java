class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();

        for (int i = 1; i < food.length; i++) { // i는 1부터 시작
            int temp = food[i];

            // 짝수 처리
            if (temp % 2 == 0) {
                int count = temp / 2; // 절반 값을 구함
                for (int j = 0; j < count; j++) {
                    answer.append(i); // i를 문자열에 추가
                }
            } else { // 홀수 처리
                temp -= 1; // 홀수일 경우 1을 뺌
                int count = temp / 2;
                for (int j = 0; j < count; j++) {
                    answer.append(i);
                }
            }
        }

        // 마지막으로 추가된 문자열의 역순을 붙임
        String reverse = new StringBuilder(answer).reverse().toString();
        answer.append("0").append(reverse);

        return answer.toString();
    }
}
