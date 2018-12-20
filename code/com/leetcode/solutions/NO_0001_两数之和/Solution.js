/**
 * 思路：定义一个 Map, 遍历数组，若 Map[nums[i]] 存在则返回结果，不存在则记录 numObj[target - nums[i]]，
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function (nums, target) {
    var len = nums.length;
    var numObj = {};
    for (var i = 0; i < len; i++) {
        var current = nums[i];
        if (current in numObj) {
            return [numObj[current], i]
        } else {
            numObj[target - current] = i;
        }
    }
};