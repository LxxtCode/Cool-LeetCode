const PHONE_NUMS = {
    '2': ['a', 'b', 'c'],
    '3': ['d', 'e', 'f'],
    '4': ['g', 'h', 'i'],
    '5': ['j', 'k', 'l'],
    '6': ['m', 'n', 'o'],
    '7': ['p', 'q', 'r', 's'],
    '8': ['t', 'u', 'v'],
    '9': ['w', 'x', 'y', 'z'],
}

/**
 * 遍历所有数字的组合
 * @param {string} digits
 * @return {string[]}
 */
var letterCombinations = function (digits) {
    const len = digits.length;
    let ans = [""];
    if (len === 0) { return []; }

    digits.split("").forEach(d => {
        ans = digitCombinations(d, ans);
    });
    return ans;
};

/**
 * 返回指定数字的所有组合
 * @param {*} index 指定数字
 * @param {*} combinations 前置组合
 * @return {string[]}
 */
var digitCombinations = function (digit, combinations) {
    const ans = [];
    combinations.forEach(s => {
        PHONE_NUMS[digit].forEach(c => {
            ans.push(s + c);
        });
    });
    return ans;
};