import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int test= 0;
        for (int i =0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for (int k=j+1; k<nums.length;k++){
                    test = nums[i]+nums[j]+nums[k];
                    if (isPrime(test)){
                        answer++;
                    }
                }
            }
        } 

        return answer;
    }
    
    public boolean isPrime(int x){
        for (int i = 2; i<=(int)Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}