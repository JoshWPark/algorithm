import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int oldMin = Integer.MAX_VALUE;
        int newMin = Integer.MAX_VALUE;
        Arrays.sort(array);
        for(int i =0; i<array.length; i++){
            newMin = Math.min(Math.abs(n-array[i]), Math.abs(n-answer));
            if(newMin<oldMin){
                
                answer = array[i];
                oldMin = newMin;
            }
            System.out.println(newMin);
        }
        return answer;
    }
}