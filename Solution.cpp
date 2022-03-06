
#include <string>
#include <algorithm>
using namespace std;

class Solution {
    
public:

    string freqAlphabets(string input) {
        const size_t size = input.length();
        const int ascii_small_case_a = 97;
        const int ascii_zero = 48;
        string decryptedInput;

        for (int i = size - 1; i >= 0; i--) {
            if (input[i] == '#') {
                int codePoint = 10 * (input[i - 2] - ascii_zero) + (input[i - 1] - ascii_zero);
                decryptedInput.push_back(ascii_small_case_a + codePoint - 1);
                i -= 2;
            } else {
                int codePoint = input[i] - ascii_zero;
                decryptedInput.push_back(ascii_small_case_a + codePoint - 1);
            }
        }
        reverse(decryptedInput.begin(), decryptedInput.end());
        return decryptedInput;
    }
};
