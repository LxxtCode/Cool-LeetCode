/**
 * 思路：根据Z 字形排列中个字符的下标位置规律，按行读取字符
 *   row1 下标：0,2n-2,...
 *   row2 下标：1,2n-3,...
 *   ...
 *   rown 下标：n-1,3n-3,...
 * @param {string} s
 * @param {number} numRows
 * @return {string}
 */
var convert = function (s, numRows) {
    let ans = '', dis = 2 * numRows - 2, size = Math.ceil(s.length / dis);
    let n = 0, j;
    while (n < numRows) {
        if (0 === n || numRows - 1 === n) {
            for (let i = 0; i < size; i++) {
                ans += s[n + i * dis] || '';
            }
        } else {
            j = dis - n;
            for (let i = 0; i < size; i++) {
                ans += s[n + i * dis] || '';
                ans += s[j + i * dis] || '';
            }
        }
        n++
    }
    return ans;
};