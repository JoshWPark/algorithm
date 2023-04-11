class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int [2];
        int x = n;
        int y = m;
        int temp = Math.min(n,m);       //temp = a에서 b를 나눈 나머지 값
        while(x%y>0){
            temp = x%y; 
            x = y;      //기존 b 값을 새로운 a 값으로 최신화
            y = temp;   //temp 값을 새로운 b 값으로 최신화
        }
        answer[0] = temp;
        answer[1] = (n*m)/temp;
        return answer;
    }
}