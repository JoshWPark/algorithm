import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] str = Long.toString(n).split("");
        Arrays.sort(str, Collections.reverseOrder());
        String reverse = "";
        for(int i=0; i<str.length; i++){
            reverse += str[i];
        }
        answer = Long.parseLong(reverse);
        return answer;
    }
}