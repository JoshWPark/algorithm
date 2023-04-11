class Solution {
    public int solution(int n) {
        int answer = 0;
        int fact = 0;
        do{
            fact = 1;
            answer++;
            for(int i =1; i<=answer; i++){
                fact *= i;
            }
            //System.out.println(fact + " " + answer);
        }while (n>fact);
        if (fact> n ){
            answer--;
        }
       
            
        return answer;
    }
}