import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        double sqrt = Math.sqrt(n);
        if(sqrt%1!=0){
            answer = -1;
        } else {
            answer = (long)(sqrt+1)*(long)(sqrt+1);
        }
        return answer;
    }
}