#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<vector<int>> score) {
    vector<int> answer;
    vector<double> average; 
    answer.resize(score.size());
    for (auto &scores : score){
        average.push_back((double)(scores[0] + scores[1])/2);
    }
    
    for(int i =0; i<average.size(); i++){
        int rank=1;
        for(int j = 0; j<average.size(); j++) {
            if(average[i] < average[j]) {
                rank++;
            }
        }
        answer[i] = rank;
    }
    
    return answer;
}