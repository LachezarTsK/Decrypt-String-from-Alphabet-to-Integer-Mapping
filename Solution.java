
public class Solution {

    public String freqAlphabets(String s) {
        final int size = s.length();
        final int ascii_small_case_a = 97;
        final int ascii_zero = 48;
        StringBuilder result = new StringBuilder();

        for (int i = size - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                int codePoint = 10 * (s.charAt(i - 2) - ascii_zero) + (s.charAt(i - 1) - ascii_zero);
                result.append((char) (ascii_small_case_a + codePoint - 1));
                i -= 2;
            } else {
                int codePoint = s.charAt(i) - ascii_zero;
                result.append((char) (ascii_small_case_a + codePoint - 1));
            }
        }
        return result.reverse().toString();
    }
}
