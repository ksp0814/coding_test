class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;

        // 지갑의 가로, 세로 크기
        int walletWidth = wallet[0];
        int walletHeight = wallet[1];

        // 지폐의 현재 가로, 세로 크기
        int billWidth = bill[0];
        int billHeight = bill[1];

        // 지폐가 지갑에 들어갈 때까지 반복
        while (!canFit(walletWidth, walletHeight, billWidth, billHeight)) {
            // 긴 쪽을 반으로 접기
            if (billWidth > billHeight) {
                billWidth /= 2;
            } else {
                billHeight /= 2;
            }
            answer++; // 접은 횟수 증가
        }

        return answer; // 최소 접기 횟수 반환
    }

    // 지갑에 들어갈 수 있는지 확인하는 메서드
    private boolean canFit(int walletWidth, int walletHeight, int billWidth, int billHeight) {
        return (billWidth <= walletWidth && billHeight <= walletHeight) ||
               (billHeight <= walletWidth && billWidth <= walletHeight);
    }
}
