class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        // 명함 돌리기
        for (int i =0; i<sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        
        int width = sizes[0][0];
        int height = sizes[0][1];
        for (int i =0; i<sizes.length; i++){
            width = Math.max(width, sizes[i][0]);
            height = Math.max(height, sizes[i][1]);
        }
        
        answer = width * height;
        return answer ;
    }
}