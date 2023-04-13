class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int [] dx = {1,-1,0,0,1,1,-1,-1};
        int [] dy = {0,0,1,-1,1,-1,1,-1};
        
        for (int i =0; i<board.length; i++){
            for (int j=0; j<board.length; j++){
                if (board[i][j]==1){
                    for (int k =0; k<dx.length; k++){
                        int a = i + dx[k];
                        int b = j + dy[k];
                        if (a>=0 && a<board.length && b>=0 && b<board.length && board[a][b] != 1){
                            board[a][b] = 9;
                        }
                    }
                }
            }
        }
        
        int count =0;
        for (int i =0; i<board.length; i++){
            for (int j=0; j<board.length; j++){
                if (board[i][j]>0){
                    count++;
                }
            }
        }
        answer = board.length * board.length - count;
        return answer;
    }
}