/**
 * 思路：设置左右指针向中靠拢，因最大容器取决于最短边，故较短边优先向另一方向移动
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function (height) {
    let left = 0,
        right = height.length - 1,
        maxSize = 0,
        a, b;

    while (left < right) {
        maxSize = Math.max((right - left) * Math.min(height[left], height[right]), maxSize);
        a = height[left], b = height[right];
        if (a > b) {
            while (height[right] <= b) {
                right--;
            }
        } else {
            while (height[left] <= a) {
                left++;
            }
        }
    }
    return maxSize;
};