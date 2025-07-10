#include <string>
#include <vector>
#include <iostream>

using namespace std;

int solution(int a, int b) {
    int answer = (2*a*b);
    string answer_str = to_string(a) + to_string(b);
    int int_answer = stoi(answer_str);
    if(int_answer > answer){
        return int_answer;
    }
    return answer;
}