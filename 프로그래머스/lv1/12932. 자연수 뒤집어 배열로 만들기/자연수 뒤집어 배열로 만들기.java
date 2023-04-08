import java.util.*;
class Solution {
    public int[] solution(long n) {       
        int a =  (int)(Math.log10(n)+1);
        int[] answer = new int [a] ;
        for (int i=0; n!=0; i++){
            answer[i] = (int)(n%10);
            n /= 10;
        }
        
        return answer;
    }
}