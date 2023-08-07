import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        int size = names.length/5;
        if(names.length%5!=0){
            size+=1;
        }
        String[] answer = new String [size];
        int ctr = 0; 
        for (int i =0; i<names.length; i= i+5){
            answer[ctr] = names[i];
            ctr++;
        }
        return answer;
    }
}