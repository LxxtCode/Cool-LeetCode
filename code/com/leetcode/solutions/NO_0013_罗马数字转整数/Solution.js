const RomanNum = {
    'I': 1,
    'V': 5,
    'X': 10,
    'L': 50,
    'C': 100,
    'D': 500,
    'M': 1000
};

/**
 * 思路：顺序遍历字符串进行转换。并比较上一个罗马数字与当前罗马数字大小，若小则为特殊情况需进行抵消
 * @param {*} s 
 */
var romanToInt = function (s) {
    let n = 0, pre = 0, cur = 0;
    for (let i = 0, len = s.length; i < len; i++) {
        n += cur = RomanNum[s[i]];
        if (pre < cur) n -= pre * 2; //上一个数小于当前数，需要进行抵消并减去
        pre = cur;
    }
    return n;
};