/**
 * 参照三数之和，多加一次嵌套
 * @param {number[]} nums
 * @param {number} target
 * @return {number[][]}
 */
var fourSum = function (nums, target) {
    nums.sort((a, b) => { return a - b });
    let ans = [];
    for (let l = 0; l < nums.length - 3; l++) {
        if (nums[l] === nums[l - 1]) continue;
        for (let i = l + 1; i < nums.length - 2; i++) {
            if (i > l + 1 && nums[i] === nums[i - 1]) continue;
            let j = i + 1;
            let k = nums.length - 1;
            while (j < k) {
                let target_temp = nums[l] + nums[i] + nums[j] + nums[k];
                if (target_temp == target) {
                    ans.push([nums[l], nums[i], nums[j], nums[k]]);
                    while (nums[--k] === nums[k + 1]);
                    while (nums[++j] === nums[j - 1]);
                }
                else if (target_temp > target) {
                    while (nums[--k] === nums[k + 1]);
                }
                else {
                    while (nums[++j] === nums[j - 1]);
                }
            }
        }
    }
    return ans;
};