import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        //초기값
        int[] person1 = {1,2,3,4,5};
        int[] person2 = {2,1,2,3,2,4,2,5};
        int[] person3 = {3,3,1,1,2,2,4,4,5,5};

        int [] score = {0,0,0};

        //정답 개수 세기
        for (int i =0; i<answers.length; i++){
            if(person1[i%5] == answers[i]){
                score[0]++;
            } 
            if (person2[i%8] == answers[i]){
                score[1]++;
            } 
            if (person3[i%10] == answers[i]){
                score[2]++;
            }    
        }
        
        //answer 배열 크기 구하기
        int max = Math.max(score[0], Math.max(score[1],score[2]));
        ArrayList<Integer> arr = new ArrayList <Integer>();
        for (int i =0; i<score.length; i++){
            if(score[i]==max){
                 arr.add(i+1);
            }
        }
        
        int [] answer= new int [arr.size()];
        for (int i =0; i<arr.size(); i++){
            answer[i] = arr.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}