/**
 * 思路：根据中位数的特性可知中位数左右两侧数字个数相等
 *      故只需猜测数组A中中位数位置，即可得出数组B中相应中位数位置
 *      使用二分法不断缩小数组A的中位数范围，最后求得中位数，时间复杂度为 O(log(m + n))
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */
var findMedianSortedArrays = function (A, B) {
    let m = A.length, n = B.length, isOdd = (m + n) % 2, res;
    if (m > n) {
        [m, n] = [n, m];
        [A, B] = [B, A];
    }
    const halfLen = ~~((m + n + 1) / 2);// j = halfLen - i;
    let imin = 0, imax = m;
    let i = (imin + imax) >> 1, j = halfLen - i;
    while (imin <= imax) {
        if (i < imax && B[j - 1] > A[i]) { //  A[i] 太小
            imin = i + 1;
        } else if (i > imin && B[j] < A[i - 1]) {//  A[i] 太大
            imax = i - 1;
        } else {
            res = isOdd ? Math.maxU(A[i - 1], B[j - 1]) : (Math.maxU(A[i - 1], B[j - 1]) + Math.minU(A[i], B[j])) / 2;
            break;
        }
        i = (imin + imax) >> 1, j = halfLen - i;
    }
    return res;
};

Math.maxU = (a, b) => {
    if (undefined === a) return b;
    if (undefined === b) return a;
    return Math.max(a, b);
}

Math.minU = (a, b) => {
    if (undefined === a) return b;
    if (undefined === b) return a;
    return Math.min(a, b);
}