/**
 * Manacher 算法:https://articles.leetcode.com/longest-palindromic-substring-part-ii/
 * @param {string} s
 * @return {string}
 */
var longestPalindrome = function (s) {
    if (s.length <= 1) return s;
    const T = '$#' + s.split('').join('#') + '#', len = T.length; // 插入特殊字符`$`作为边界，防止越界
    const P = [];
    let longest = 0, longestL = 0, C = 0, R = 0;

    for (let i = 0; i < len; i++) {
        P[i] = 1;
    }

    for (let i = 1; i < len; i++) {
        if (i < R) {
            if (P[2 * C - i] < R - i + 1) {
                P[i] = P[2 * C - i];
            } else {
                P[i] = R - i + 1;
                while (T[i - P[i]] === T[i + P[i]]) P[i]++;
            }
        } else {
            while (T[i - P[i]] === T[i + P[i]]) P[i]++;
        }

        if (i + P[i] - 1 > R) {
            C = i;
            R = i + P[i] - 1;
            if (P[i] > longest) {
                longest = P[i];
                longestL = i - P[i] + 1;
            }
        }
    }
    return s.substr((longestL - 1) / 2, longest - 1);
};