#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> arr) {
    vector<int> answer;
    for (auto i : arr){
        if(i%2 == 0){
            if(i>=50){
                answer.push_back(i/2);
            }
            else{
                answer.push_back(i);
            }
        }
        if(i%2 == 1){
            if(i<50){
                answer.push_back(i*2);
            }
            else{
                answer.push_back(i);
            }
        }
        
    }
    return answer;
}