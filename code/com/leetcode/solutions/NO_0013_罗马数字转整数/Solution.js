const RomanNum = {
    'I': 1,
    'V': 5,
    'X': 10,
    'L': 50,
    'C': 100,
    'D': 500,
    'M': 1000,
};

var romanToInt = function (s) {
    let n = 0, pre = 0, cur = 0;
    s.split('').forEach(a => {
        n += cur = RomanNum[a];
        if (pre < cur) n -= pre * 2; //上一个数小于当前数，需要进行抵消并减去
        pre = cur;
    });
    return n;
};