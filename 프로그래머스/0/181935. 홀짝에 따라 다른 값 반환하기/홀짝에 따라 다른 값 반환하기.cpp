#include <string>
#include <vector>
#include <iostream>

using namespace std;

int solution(int n) {
    int answer = 0;
    if(n%2 ==0){
        while(n>0){
            answer += n*n;
            n = n - 2;
        }
    }
    else {
        while(n>0){
            answer += n;
            n = n - 2;
        }
    }
    return answer;
}