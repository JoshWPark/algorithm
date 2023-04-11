class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int maxL=dots[0][0];
        int minL=dots[0][0];
        int maxW=dots[0][1];
        int minW=dots[0][1];;
        for (int i =0; i<dots.length;i++){
            maxL = Math.max(dots[i][0],maxL);
            minL = Math.min(dots[i][0],minL);
            maxW = Math.max(dots[i][1],maxW);
            minW = Math.min(dots[i][1],minW);
        }
        answer = (maxL-minL)*(maxW-minW);
        return answer;
    }
}