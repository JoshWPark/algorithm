class Solution {
    public int solution(int n) {
        int answer = 0;
        int [] noThreeNum = new int [101];
        int cnt = 0;
        for (int i =0; i<noThreeNum.length; i++){
            cnt++;
            if(cnt%3==0){
                i--;
            } else if ( cnt<100 && (cnt%10 ==3 || cnt/10 == 3)){
                i--;
            } else if ( cnt>100 && (cnt%10 ==3 || cnt/10%10 == 3)){
                i--;
            } else {
                noThreeNum[i] = cnt;
            }
            
        }
        answer = noThreeNum[n-1];
        return answer;
    }
}


