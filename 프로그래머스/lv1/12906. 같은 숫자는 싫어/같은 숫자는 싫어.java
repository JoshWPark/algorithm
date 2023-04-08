import java.util.*;
public class Solution {
    public int[] solution(int [] arr) {
       
        ArrayList<Integer> intList = new ArrayList<Integer>();
        
        intList.add(arr[0]);
        int temp =arr[0];
        
        for (int i = 1; i<arr.length; i++){
            if(arr[i]==temp){
                continue;
            }
            intList.add(arr[i]);
            temp = arr[i];
        }
        
        int [] answer = new int [intList.size()];
        for (int i =0; i<answer.length; i++) {
            answer[i] = intList.get(i);
        }
        
        
        return answer;
    }
}