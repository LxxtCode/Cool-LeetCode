/**
 * 思路：参照三数之和
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var threeSumClosest = function (nums, target) {
    nums.sort((a, b) => a - b);
    const len = nums.length, e = len - 2, s = len - 1;
    let ans = nums[0] + nums[1] + nums[2] - target, sum, i = 0;

    for (let j, k; i < e; i++) {
        j = i + 1;
        k = s;
        while (j < k) {
            sum = nums[i] + nums[j] + nums[k] - target;
            if (sum > 0) k--;
            else if (sum < 0) j++;
            else {
                ans = 0;
                break;
            }
            if (Math.abs(sum) < Math.abs(ans)) {
                ans = sum;
            }
        }
        if (ans === 0) break;
    }
    return ans + target;
};