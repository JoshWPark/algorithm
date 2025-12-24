#include <string>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> arr, vector<vector<int>> queries) {
    vector<int> answer;
    for (int i =0 ; i<queries.size(); i++){
        vector<int> temp;
        for (int j = queries[i][0]; j <=queries[i][1] ; j++){
            if(arr[j] > queries[i][2]){
                temp.push_back(arr[j]);
            }
        }
        int min = 0;
        if(temp.empty()) {min = -1;}
        else{
            min = temp[0];
            for (auto& candidate : temp){
                if(candidate < min){
                    min = candidate;
                }
            }
        }
        
        answer.push_back(min);
        temp.clear();
    }
    return answer;
}