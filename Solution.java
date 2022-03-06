
public class Solution {

    public String freqAlphabets(String input) {
        final int size = input.length();
        final int ascii_small_case_a = 97;
        final int ascii_zero = 48;
        StringBuilder decryptedInput = new StringBuilder();

        for (int i = size - 1; i >= 0; i--) {
            if (input.charAt(i) == '#') {
                int codePoint = 10 * (input.charAt(i - 2) - ascii_zero) + (input.charAt(i - 1) - ascii_zero);
                decryptedInput.append((char) (ascii_small_case_a + codePoint - 1));
                i -= 2;
            } else {
                int codePoint = input.charAt(i) - ascii_zero;
                decryptedInput.append((char) (ascii_small_case_a + codePoint - 1));
            }
        }
        return decryptedInput.reverse().toString();
    }
}
