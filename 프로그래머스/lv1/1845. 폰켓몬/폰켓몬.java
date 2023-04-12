import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int max = nums.length/2;
        LinkedHashSet <Integer> set = new LinkedHashSet<Integer>();
        for(int i =0; i<nums.length; i++){
            set.add(nums[i]);
        }
        int min = set.size();
        if (min > max){
            answer = max;
        }
        else {
            answer = min;
        }
        
        return answer;
    }
}