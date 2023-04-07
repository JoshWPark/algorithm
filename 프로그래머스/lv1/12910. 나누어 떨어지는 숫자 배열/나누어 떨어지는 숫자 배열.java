import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        // 
        // int count = 0;
        // for(int i = 0; i<arr.length; i++){
        //     if(arr[i]%divisor ==0){
        //         count++;
        //     }
        // }
        // if (count == 0){
        //     answer = new int [1];
        //     answer[0] = -1;
        // }
        // else{
        //     answer = new int [count];
        // }     
        ArrayList<Integer> num = new ArrayList<Integer>();
        int[] answer = {};
        for (int i =0; i<arr.length; i++){         
             if(arr[i]%divisor==0){
                num.add(arr[i]);
            }
        }
        if (num.isEmpty()){
            answer= new int [1]; 
            answer[0] = -1;
        } else {
            answer= new int [num.size()]; 
            for (int i =0; i < num.size(); i++){
                answer[i]=num.get(i).intValue();
            }
        }
        
        Arrays.sort(answer);
        return answer;
    }
}