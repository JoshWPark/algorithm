import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        String lower = s.toLowerCase();
        int pCnt = 0;
        int yCnt = 0;
        for (int i=0; i<lower.length(); i++){
            char a = lower.charAt(i);
            if(Character.compare(a,'p')==0){
                pCnt++;
            } else if(Character.compare(a,'y')==0){
                yCnt++;
            }
        }
        if(pCnt != yCnt){
            answer = false;
        } 

        return answer;
    }
}