#include <string>
#include <vector>

using namespace std;

int solution(int a, int b, int c) {
    int answer = 0;\
    
    if(a==b){
        if (a==c){ //3 same
            answer = (a+b+c) * ((a*a) + (b*b)+ (c*c)) * ((a*a*a) + (b*b*b)+ (c*c*c)) ;
        }
        else { //2 same
            answer = (a+b+c) * ((a*a) + (b*b)+ (c*c));
        }
    }
    else if (b==c){
        if (b==a){ //3 same
            answer = (a+b+c) * ((a*a) + (b*b)+ (c*c)) * ((a*a*a) + (b*b*b)+ (c*c*c)) ;
        }
        else { //2 same
            answer = (a+b+c) * ((a*a) + (b*b)+ (c*c));
        }
    }
    else if (c==a){
        if (c==b){ //3 same
            answer = (a+b+c) * ((a*a) + (b*b)+ (c*c)) * ((a*a*a) + (b*b*b)+ (c*c*c)) ;
        }
        else { //2 same
            answer = (a+b+c) * ((a*a) + (b*b)+ (c*c));
        }
    }
    else {
        answer = a + b+ c;
    }
    return answer;
}