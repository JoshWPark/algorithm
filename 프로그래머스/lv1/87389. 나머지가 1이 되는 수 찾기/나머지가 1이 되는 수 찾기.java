class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = n-1;
        while (a>0){
            if(n%a==1){
                answer = a;
            }
            a--;
        }
        return answer;
    }
}