import java.util.*;

class Solution {    
    public int solution(String[][] book_time) {        
        int answer = 0;
        int[] arr = new int[1440]; // 하루(24시간 = 1440분)를 1분 단위로 저장하는 배열

        // 예약된 시간대마다 배열 값을 증가
        for (String[] book : book_time) {
            int start = changeMin(book[0]);        // 시작 시간 (분 단위 변환)
            int end = Math.min(1439, changeMin(book[1]) + 10); // 종료 시간 + 청소 시간 10분

            for (int j = start; j < end; j++) { 
                arr[j]++; // 해당 분에 사용 중인 객실 개수를 증가
            }
        }

        // 가장 많이 겹치는 순간의 객실 개수 찾기
        for (int i = 0; i < 1440; i++) {
            answer = Math.max(answer, arr[i]); 
        }

        return answer;
    }

    // "HH:mm" 형식의 시간을 분(minute) 단위로 변환하는 메서드
    public int changeMin(String time) {        
        int h = Integer.parseInt(time.split(":")[0]); // "HH"
        int m = Integer.parseInt(time.split(":")[1]); // "mm"
        return h * 60 + m; // 총 분(minute) 값 반환
    }
}
