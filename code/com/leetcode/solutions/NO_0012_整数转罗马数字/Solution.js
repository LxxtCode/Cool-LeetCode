const RomanNum = [{ "n": 1000, "r": "M" }, { "n": 900, "r": "CM" }, { "n": 500, "r": "D" }, { "n": 400, "r": "CD" }, { "n": 100, "r": "C" }, { "n": 90, "r": "XC" }, { "n": 50, "r": "L" }, { "n": 40, "r": "XL" }, { "n": 10, "r": "X" }, { "n": 9, "r": "IX" }, { "n": 5, "r": "V" }, { "n": 4, "r": "IV" }, { "n": 1, "r": "I" }];

var intToRoman = function (num) {
    let ans = '', t = 0;
    RomanNum.forEach(d => {
        t = ~~(num / d.n);
        if (t > 0) {
            num = num % d.n;
            ans += (new Array(t + 1)).join(d.r);
        }
    });
    return ans;
};