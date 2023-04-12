class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int leftPos = 10;
        int rightPos = 12;
         for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            if (number == 1 || number == 4 || number == 7) { // 왼손 열
                answer += "L";
                leftPos = number;
            } else if (number == 3 || number == 6 || number == 9) { // 오른손 열
                answer += "R";
                rightPos = number;
            } else { // 가운데 열
                int leftDist = getDist(number, leftPos);
                int rightDist = getDist(number, rightPos);
                if (leftDist < rightDist || (leftDist == rightDist && hand.equals("left"))) { // 왼손 가까울 때
                    answer += "L";
                    leftPos = number;
                } else { // 오른손 가까울 때
                    answer += "R";
                    rightPos = number;
                }
            }
        }
        
        return answer;
    }
    
   public int getDist(int number, int pos) { // 거리 계산 함수
        if (number == 0) number = 11; // 0인 경우 11로 치환
        if (pos == 0) pos = 11; // 0인 경우 11로 치환
        int x1 = (pos - 1) / 3;
        int y1 = (pos - 1) % 3;
        int x2 = (number - 1) / 3;
        int y2 = (number - 1) % 3;
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }
}