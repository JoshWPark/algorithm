class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int a_length = (int)(Math.log10(a)+1);
        int b_length = (int)(Math.log10(b)+1);
        int a_temp = (int)(b*(Math.pow(10,a_length))) + a;
        int b_temp = (int)(a*(Math.pow(10,b_length))) + b;
        answer = Math.max(a_temp,b_temp);
        return answer;
    }
}