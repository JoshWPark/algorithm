import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        boolean [] prime = new boolean [n+1];
        Arrays.fill(prime,true);
        prime[0] = false;
        prime[1] = false;
        // System.out.print(Math.sqrt(n));
        for(int i =2; i<=Math.sqrt(n); i++){
            if(prime[i]){
                for(int j = i*i; j<=n; j+=i){
                    prime[j]=false;
                }
            }
        }
        
        for(int i =2; i<=n; i++){
            if(prime[i]){
                answer++;
            }
        }
       
        return answer;
    }
}