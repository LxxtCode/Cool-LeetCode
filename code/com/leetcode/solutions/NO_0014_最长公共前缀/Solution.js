/**
 * 按列扫描字符串数组
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function (strs) {
    if (!strs.length) return "";
    const len = strs[0].length, aL = strs.length;
    let flag = false, t = '', i;
    for (i = 0; i < len; i++) {
        t = strs[0][i];
        for (let j = 1; j < aL; j++) {
            if (strs[j][i] !== t) {
                return strs[0].substr(0, i);
            }
        }
    }

    return strs[0];
};