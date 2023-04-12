import java.util.*;
class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int [] arr = new int [3];
        String score = dartResult.replaceAll("[^0-9]","-");
        score = score.replaceAll("[-]{2,}","-");
        score = score.replaceAll("[-]$","");
        String [] scoreArr = score.split("-");
        for(int i = 0; i< scoreArr.length; i++){
            arr[i] = Integer.parseInt(scoreArr[i]);
        }
        
        for (int i=0, j=0; i<dartResult.length();i++){
            char a = dartResult.charAt(i);
            if(Character.isDigit(a)) {continue;}
            else {
                switch (a){
                    case 'S' : arr[j] = arr[j]*1; j++; break;
                    case 'D' : arr[j] = arr[j] * arr[j]; j++; break;
                    case 'T' : arr[j] = arr[j] * arr[j] * arr[j]; j++; break;
                    case '*' : 
                        if(j==1){
                            arr[j-1] = arr[j-1]*2;
                        } else {
                            arr[j-2] = arr[j-2]*2;
                            arr[j-1] = arr[j-1]*2;
                        }
                        break;
                    case '#' : arr[j-1] = arr[j-1] * -1; break;
                    
                }
            }
        }
        for(int i = 0; i< arr.length; i++){
            answer += arr[i];
        }
       
        return answer;
    }
}