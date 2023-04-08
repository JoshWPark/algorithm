import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n,3);
        String reverse = "";
        for (int i = str.length()-1; i>=0; i--){
            reverse += str.charAt(i);
        }
        //10 진법으로 변경
        
        answer = Integer.parseInt(reverse,3);
        return answer;
    }
}


// class Solution {
//     public int solution(int n) {
//         int answer =0;
//         String str = "";
//         while(n>0){
//             str += n%3;
//             n/=3;
//         }
//         answer = Integer.parseInt(str, 3);
//         return answer;
//     }
// }
       
// class Solution {
//     public int solution(int n) {
//         int answer = 0;
//         int triNum = 0; //3진법
//         int cnt = 0; //제곱근
//         //3진법 구하기
//         while (n>0){
//             if (cnt == 0){
//                 triNum = n%3;
//             } else {
//                 triNum = triNum + n%3 * (int)Math.pow(10,cnt);
//             }
//             n = n / 3;
//             cnt++;
//         }
//         //앞뒤 반전
//         String str = "" + triNum;
//         String tempAns = "";
//         for (int i = str.length()-1; i>=0; i--){
//             tempAns += str.charAt(i);
//         }
        
//         //10 진법으로 변경
//         answer = Integer.parseInt(tempAns, 3);
//         return answer;
//     }
// }

        