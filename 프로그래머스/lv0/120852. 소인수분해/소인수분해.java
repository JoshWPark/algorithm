import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList <Integer> arr = new ArrayList<Integer>();
        int cnt=2;
        while (n>=cnt){
            if(n%cnt == 0){
                n/=cnt;
                if(!arr.contains(cnt)){
                    arr.add(cnt);
                }
            }
            else {
                cnt++;
            }
        }
        int[]answer = new int [arr.size()];
        for (int i =0; i<arr.size();i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}