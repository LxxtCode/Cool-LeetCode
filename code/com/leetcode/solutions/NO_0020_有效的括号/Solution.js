const MATCH = {
    '(': ')',
    '[': ']',
    '{': '}',
}

/**
 * 思路：借助栈存储符号，比较符号与栈顶符号匹配则出栈，否则入栈
 * @param {string} s
 * @return {boolean}
 */
var isValid = function (s) {
    const q = [];
    for (let i = 0, len = s.length; i < len; i++) {
        if (MATCH[s[i]]) q.push(s[i]);
        else {
            if (MATCH[q.pop()] !== s[i]) return false;
        }
    }
    return !q.length;
};