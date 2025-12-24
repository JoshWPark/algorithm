#include <string>
#include <vector>
#include <algorithm>
#include <cctype>

using namespace std;

string solution(string myString) {
    string answer = "";
    std::transform(myString.begin(), myString.end(), myString.begin(), [](unsigned char c){
        return std::toupper(c);
    });
    answer = myString;
    return answer;
}