import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> arr = new ArrayList <Integer>();
        for (int i =0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                int num = numbers[i]+numbers[j];
                if(arr.contains(num)){
                    continue;
                }
                arr.add(num);
            }
        }
        int[] answer = new int [arr.size()];
        Collections.sort(arr);
        for (int i = 0; i<arr.size(); i++){
            answer[i] = arr.get(i);
        }
        
        return answer;
    }
}

    
    
    
    
    
    
    