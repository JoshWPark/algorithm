#include <string>
#include <vector>
#include <algorithm>
#include <climits>
using namespace std;

vector<int> solution(vector<int> numlist, int n) {
    vector<int> answer;
    int num_size = numlist.size();
    
    while(answer.size() != num_size){
        int temp = 100001;
        for (auto &number : numlist){
            auto number_already_exist_in_vector = std::find_if(answer.begin(), answer.end(),
              [number](int num_added){return number == num_added;});
            if(number_already_exist_in_vector != answer.end()){
                continue;
            }
            else{
                if (number == n){
                    answer.push_back(number);
                }
                else {
                    if(abs(number - n) < abs(temp - n)){
                        temp = number;
                    }
                    if(abs(number - n) == abs(temp - n)){
                        if(number > temp){
                            temp = number;
                        }
                    }
                }
                // auto number_pos_in_numlist = std::find(numlist.begin(), numlist.end(), number);
                // if(number_pos_in_numlist != numlist.end())
                // {
                //     numlist.erase(number_pos_in_numlist);
                // }
            }
        }
        if(temp != 100001){
            answer.push_back(temp);
        }
    }
    return answer;
}