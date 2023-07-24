import java.util.*;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> map = new HashMap();
        for(int i =1 ; i<=s.length(); i++){
            char x = s.charAt(i-1);
            if(map.containsKey(x)){
                answer[i-1] = i - map.get(x);
                    map.put(x, i);
            }
            else{
                map.put(x,i);
                answer[i-1] = -1;
            }
            
        }
        return answer;
    }
}