import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        LinkedList<String> listP = new LinkedList<>(Arrays.asList(participant));
    
        listP.sort(Comparator.naturalOrder());
        Arrays.sort(completion);
        for (int i=0; i<completion.length; i++){
            if(listP.get(0).equals(completion[i])){
                listP.remove(0);
            } else if(listP.get(1).equals(completion[i])){
                listP.remove(1);
            }
        }
        answer = listP.get(0);
        return answer;
    }
}