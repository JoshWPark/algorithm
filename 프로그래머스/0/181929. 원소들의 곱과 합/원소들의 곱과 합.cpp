#include <string>
#include <vector>
#include <iostream>

using namespace std;

int solution(vector<int> num_list) {
    int answer = 0;
    int multiply = 1;
    int multiple_of_sum = 0;
    for(int i=0; i<num_list.size(); i++ ){
        multiply = multiply * num_list[i];
        multiple_of_sum += num_list[i];
    }
    multiple_of_sum = multiple_of_sum*multiple_of_sum;
    std::cout << multiply << std::endl;
    std::cout << multiple_of_sum << std::endl;
    if(multiple_of_sum>multiply){answer = 1;}
    return answer;
}