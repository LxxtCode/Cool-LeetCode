/**
 * 思路：a + c + c = 0 且 a <= b <= c 
 *      => -a = b + c 且 a <= b <= c
 *      => a <= 0
 *      将数组排序后，设置下标 i, j = i+1, k = nums.length -1 (i < j < k)
 *      若 -nums[i] < num[j] + nums[k],这 k 左移
 *      若 -nums[i] > num[j] + nums[k],这 j 右移
 *      若 -nums[i] = num[j] + nums[k],返回[i,j,k],i左移并继续上诉操作
 * @param {number[]} nums
 * @return {number[][]}
 */
var threeSum = function (nums) {
    const ans = [];
    let sum, i = 0, prei;
    nums.sort((a, b) => a - b);
    for (let j, k, prej, prek; nums[i] < 0; i++) {
        if (nums[i] === nums[i - 1]) continue;
        j = i + 1;
        k = nums.length - 1;
        sum = null;
        while (j < k) {
            sum = nums[i] + nums[j] + nums[k]
            if (sum > 0) k--;
            else if (sum < 0) j++;
            else {
                if (nums[i] !== nums[prei] || nums[j] !== nums[prej] || nums[k] !== nums[prek]) {
                    ans.push([nums[i], nums[j], nums[k]]);
                }
                prei = i, prej = j, prek = k, k-- , j++;
            }
        }
    }
    if (nums[i] === 0 && nums[i + 1] === 0 && nums[i + 2] === 0) ans.push([nums[i], nums[i + 1], nums[i + 2]]);
    return ans;
};