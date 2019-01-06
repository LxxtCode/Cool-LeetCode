/**
 * @param {string} str
 * @return {number}
 */
var myAtoi = function(str) {
    var n = parseInt(str);
    if(n){
        if(n < -2147483648) return -2147483648;
        if(n > 2147483647) return 2147483647;
        return n;
    }else{
        return 0;
    }
};