/**
 * @param {number} x
 * @return {number}
 */
var reverse = function (x) {
    const isNeg = x < 0;
    x = (Math.abs(x) + '').split('').reverse().join('') * 1; // 不考虑效率，秀就完事
    x = isNeg ? -x : x;
    return (x < -2147483648 || x > 2147483647) ? 0 : x; // 判断是否越界
};