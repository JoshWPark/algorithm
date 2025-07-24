#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
int solution(int n, const char* control) {
    int answer = 0;
    for (int i = 0; i<strlen(control); i++){
        switch (control[i]){
            case 'w':
                n = n+1;
                break;
            case 's':
                n = n-1;
                break;
            case 'd':
                n = n+10;
                break;
            case 'a':
                n = n-10;
                break;
        }
    }
    answer = n;
    return answer;
}