import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int [N];
        double[] stageFailedRate = new double[N+1];
        double[] sortedStageFailedRate = new double[N+1];
        int[] stageReached = new int[N+1];
        int[] stageReachedTotal = new int[N+1];
        
        for (int i =0; i<stages.length; i++){
            int reached = (int)(stages[i]%(N+1));
            stageReached[reached]++;
            //index 0은 모든 스테이지를 클리어한 사람의 수
            
            //모든 스테이지를 클리어 한 사람
            if (reached == 0){
                for (int j=1; j<=N; j++){
                    //클리어한 모든 스테이지 이하까지 증가
                    stageReachedTotal[j]++;
                }
            }
            else {
                for (int j=1; j<=reached; j++){
                    //클리어한 모든 스테이지 이하까지 증가
                    stageReachedTotal[j]++;
                }
            }
        }   
        System.out.println(Arrays.toString(stageReached));
        System.out.println(Arrays.toString(stageReachedTotal));
        
        for (int i = 1 ; i <= N ; i++) {
            if (stageReachedTotal[i] != 0) {
                stageFailedRate[i] = (double)stageReached[i]/(double)stageReachedTotal[i];
            }
            else {
                stageFailedRate[i] = 0;
            }
            sortedStageFailedRate[i] = stageFailedRate[i];
        }
        // 모두 클리어한 사람 확률은 필요 없음
        stageFailedRate[0] = -1;
        // 1보다 큰 수로 확률 배열의 정렬에 방해 안되게
        sortedStageFailedRate[0] = 10;

        // 오름차순 정렬, 가장 마지막 수는 10(사용 안 함)
        Arrays.sort(sortedStageFailedRate);

        System.out.println(Arrays.toString(stageFailedRate));
        System.out.println(Arrays.toString(sortedStageFailedRate));
        
        
        for (int i = 1 ; i <= N ; i++) {
            for (int j = 1 ; j <= N ; j++) {
                if (sortedStageFailedRate[N-i] == stageFailedRate[j] ) {
                    answer[i-1] = j;
                    sortedStageFailedRate[N-i] = 10;
                    stageFailedRate[j] = -1;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(stageFailedRate));
        System.out.println(Arrays.toString(sortedStageFailedRate));
        
        
        
        return answer;
    }
}