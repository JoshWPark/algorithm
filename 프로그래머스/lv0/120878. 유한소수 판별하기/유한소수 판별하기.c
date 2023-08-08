#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
int GCD (int a, int b){
    int temp; 
    while(a%b>0){
        temp = a%b;
        a = b;
        b = temp;
    }
    return b;
}
int solution(int a, int b) {
    int answer = 2;
    int gcd = GCD(a,b);
    a = a/gcd;
    b = b/gcd;
    while(b%2==0){
        b/=2;
    }
    while(b%5==0){
        b/=5;
    }
    if (b==1)
        answer = 1;
    return answer;
}