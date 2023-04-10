import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int [2];
        int highest = 7;
        int lowest = 7;
        for (int i =0; i<lottos.length; i++){
            if (lottos[i]==0){
                highest--;
            } else {
                for(int j =0; j<win_nums.length; j++){
                    if(lottos[i]==win_nums[j]){
                        highest--;
                        lowest--;
                        break;
                    }
                }
            } 
            System.out.print(highest + " ");
            System.out.println(lowest);
        }
        if(highest == 7){
            highest = 6;
        } 
        if(lowest == 7){
            lowest = 6;
        }
        answer[0] = highest;
        answer[1] = lowest;
        return answer;
    }
}