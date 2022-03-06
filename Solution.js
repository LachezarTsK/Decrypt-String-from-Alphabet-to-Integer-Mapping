
/**
 * @param {string} input
 * @return {string}
 */
var freqAlphabets = function (input) {
    const size = input.length;
    const ascii_small_case_a = 97;
    const ascii_zero = 48;
    const decryptedInput = [];

    for (let i = size - 1; i >= 0; i--) {
        if (input.charAt(i) === '#') {
            let codePoint = 10 * (input.codePointAt(i - 2) - ascii_zero) + (input.codePointAt(i - 1) - ascii_zero);
            decryptedInput.push(String.fromCodePoint(ascii_small_case_a + codePoint - 1));
            i -= 2;
        } else {
            let codePoint = input.codePointAt(i) - ascii_zero;
            decryptedInput.push(String.fromCodePoint(ascii_small_case_a + codePoint - 1));
        }
    }
    return decryptedInput.reverse().join('');
};
