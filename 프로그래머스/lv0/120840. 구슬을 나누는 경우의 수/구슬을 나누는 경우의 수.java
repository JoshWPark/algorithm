class Solution {
    static int [][] dp = new int[31][31]; //동적계획법, 변수가 2개여서 2차원 dp 사용
    
    public int solution(int balls, int share) {
        int answer = 0;
        
        // dp 초기화 : 조합의 성질
        for (int i = 1; i < 31; i++) {
            dp[i][i] = 1;       // nCn = 1
            dp[i][0] = 1;       // nC0 = 1
        }
        answer = combination(balls,share);
        
        return answer;
    }
    
    public static int combination(int n, int r) {       // 조합 함수
        if(dp[n][r] != 0 ) {
            return dp[n][r];
        }
        else{
            return dp[n][r] = combination(n-1,r-1) + combination(n-1,r);        //nCr = n-1Cr-1 + n-1Cr
        }
    }
}