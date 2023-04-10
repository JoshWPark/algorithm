class Solution {
    public int solution(int[] sides) {
        int answer = 1;
        int max = Math.max(sides[0],Math.max(sides[1],sides[2]));
        if (max == sides[0]){
            if(max >= (sides[1] + sides[2])){
                answer = 2;
            }
        } else if (max == sides[1]){
            if(max >= (sides[0] + sides[2])){
                answer = 2;
            }
        } else if (max == sides[2]){
            if(max >= (sides[1] + sides[0])){
                answer = 2;
            }
        } 
        return answer;
    }
}