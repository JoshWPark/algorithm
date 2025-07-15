#include <string>
#include <vector>

using namespace std;

string solution(string bin1, string bin2) {
    string answer = "";
     int carry = 0;
    int i = bin1.size() - 1;
    int j = bin2.size() - 1;

    while (i >= 0 || j >= 0 || carry) {
        int bitA = (i >= 0) ? bin1[i--] - '0' : 0;
        int bitB = (j >= 0) ? bin2[j--] - '0' : 0;
        int sum = bitA + bitB + carry;
        char digit = (sum % 2) + '0';
        carry = sum / 2;

        answer.insert(answer.begin(), digit);
    }
    return answer;
}