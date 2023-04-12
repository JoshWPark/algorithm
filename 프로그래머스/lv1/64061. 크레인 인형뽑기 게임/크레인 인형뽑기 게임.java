import java.util.*;
class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack <Integer> prize = new Stack <Integer>();
        int answer = 0;
        for (int i =0; i<moves.length; i++){
            int place = moves[i]-1;     // 가로 구하기
            int gift = 0;
            for(int j=0; j<board.length; j++){  
                if(board[j][place]>0){
                    if(!prize.isEmpty() && prize.peek().equals(board[j][place])){
                        prize.pop();
                        answer += 2;
                    }else {
                        prize.push(board[j][place]);
                    }
                    board[j][place] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}


// import java.util.*;

// class Solution {
    // // [4,3,1,1,3]
    // public int solution(int[][] board, int[] moves) {
        // int answer = 0;
        // Stack<Integer> stack = new Stack<>();
        // // 보드의 5자리 배열들을 갖고옴
        // for (int move : moves){
            // for (int i=0; i< board.length; i++){
            // int doll = board[i][move -1];
            // if(doll != 0 ){
            // if(!stack.isEmpty() && stack.peek().equals(doll)){
            // stack.pop();
            // answer+=2;
            // }else{
            // stack.push(doll);
        // }

        // board[i][move -1] = 0;
        // break;
        // }
        // }
        // }


    // return answer;
    // }
// }