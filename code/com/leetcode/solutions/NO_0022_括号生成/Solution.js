/**
 * 思路：递归生成圆括号组合
 * @param {number} n
 * @return {string[]}
 */
var generateParenthesis = function (n) {
    if (n === 0) return [];

    const allParenthesis = [];
    nextParenthesis(allParenthesis, '', n, n);

    return allParenthesis;
};

/**
 * 获取有效的圆括号组合(有效的括号 => RN >= LN >= 0)
 * @param {*} parenthesis 所有
 * @param {*} current 当前圆括号字符串
 * @param {*} LN 剩余左圆括号数目
 * @param {*} RN 剩余右圆括号数目
 */
var nextParenthesis = function (parenthesis = [], current = '', LN, RN) {
    if (RN === 0) {
        parenthesis.push(current);
        return;
    }

    if (LN === 0) {
        nextParenthesis(parenthesis, current + ')', LN, RN - 1);
        return;
    }

    nextParenthesis(parenthesis, current + '(', LN - 1, RN);
    if (LN !== RN) {
        nextParenthesis(parenthesis, current + ')', LN, RN - 1);
    }
}