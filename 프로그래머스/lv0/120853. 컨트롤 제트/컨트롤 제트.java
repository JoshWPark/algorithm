class Solution {
    public int solution(String s) {
        int answer = 0;
        int lastAdd = 0;
        String [] temp = s.split(" ");
        for(int i =0; i<temp.length; i++){
            try{
                answer += Integer.parseInt(temp[i]);
                lastAdd = Integer.parseInt(temp[i]);
            }catch(NumberFormatException e){
                answer -= lastAdd;
            }
        }
        return answer;
    }
}