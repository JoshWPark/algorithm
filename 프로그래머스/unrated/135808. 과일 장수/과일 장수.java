import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        reverseSort(score);
        for(int i =0; i<score.length;i+=m){
            int leastNum =score[i];
            for(int j=0+i; j<m+i; j++){
                if(j>=score.length)
                    break;
                else
                    leastNum = Math.min(leastNum,score[j]);
            }
            if(i+m>score.length)
                break;
            else
                answer += leastNum*m;
        }
        return answer;
    }
    
    public static void reverseSort(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
}