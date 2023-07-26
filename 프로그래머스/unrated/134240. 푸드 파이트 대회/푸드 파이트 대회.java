class Solution {
    public String solution(int[] food) {
        String answer = "";
        for (int x =1; x< food.length; x++){
            if(food[x]%2!=0){
                food[x] = food[x]-1;
            }
        }
        for(int i = 1; i<food.length; i++){
            for(int j =0; j<(food[i]/2); j++){
                answer += Integer.toString(i);
            }
        }
        answer += "0";
        for(int i = food.length - 1 ; i>0; i--){
            for(int j =(food[i]/2); j>0; j--){
                answer += Integer.toString(i);
            }
        }
        return answer;
    }
}