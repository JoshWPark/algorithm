import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        my_string= my_string.replaceAll("[a-z]","");
        int num = Integer.parseInt(my_string);
        ArrayList<Integer> arr = new ArrayList <Integer>();
        if(num==0){
            arr.add(0);
        } else {
            while(num>0){
                arr.add(num%10);
                num /= 10;
            }
        }
        
        int[] answer = new int [arr.size()];
        for (int i = arr.size()-1,j=0; i>=0; i--,j++){
            answer[i] = arr.get(j);
        }
        Arrays.sort(answer);
        return answer;
    }
}