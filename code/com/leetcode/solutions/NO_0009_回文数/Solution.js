/**
 * 思路：转数字为字符串，转换为判断回文字符串
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function (x) {
    if (x <= 0 || x % 10 === 0) return !x;

    let xStr = x + '';
    const max = xStr.length - 1,
        mid = max / 2;
    let j;
    for (let i = 0; i < mid; i++) {
        j = max - i;
        if (xStr[i] !== xStr[j]) return false;
    }
    return true;
};