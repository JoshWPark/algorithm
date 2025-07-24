#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// numLog_len은 배열 numLog의 길이입니다.
char* solution(int numLog[], size_t numLog_len) {
    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
     char* answer = (char*)malloc((numLog_len - 1 + 1) * sizeof(char));
    if (answer == NULL) return NULL;
    for(int i = 0; i<numLog_len; i++){
        if(i+1 >= numLog_len){
            break;
        }
        else{
            int difference = numLog[i+1] - numLog[i];
            switch (difference) {
                case 1: //w
                    answer[i] = 'w';
                    break;
                case -1: //s
                    answer[i] = 's';
                    break;
                case 10: //d
                    answer[i] = 'd';
                    break;
                case -10: //a
                    answer[i] = 'a';
                    break;
                default:
                    break;
            }
            
        }
    }
    answer[numLog_len - 1] = '\0';  // 널 종료 문자 꼭 추가!
    return answer;
}