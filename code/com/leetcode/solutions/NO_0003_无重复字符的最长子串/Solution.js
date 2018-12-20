/**
 * 遍历字符串, 记录每次字符出现的位置,存在重复字符串则更新 最长字符串开始位置`left`, 计算 maxLen = Math.max(i - `left` + 1, maxLen);
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function (s) {
    let len = s.length, maxLen = 0, map = {}, left = 0;

    let tChar;
    for (let i = 0; i < len; i++) {
        tChar = s[i];
        if (map.hasOwnProperty(tChar)) {
            left = Math.max(map[tChar], left);
        }
        maxLen = Math.max(i - left + 1, maxLen);
        map[tChar] = i + 1;
    }

    return maxLen;
};