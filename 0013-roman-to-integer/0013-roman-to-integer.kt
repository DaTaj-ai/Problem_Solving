class Solution {
    fun romanToInt(s: String): Int {
        val valueMap = mapOf(
        'I' to 1,
        'V' to 5,
        'L' to 50,
        'C' to 100,
        'X' to 10,
        'D' to 500,
        'M' to 1000,
    )
    var   current = 0
    var  res =  0
    var  prev = 0
    for(i in s.indices.reversed() ) {
        current = valueMap[s[i]]?:0
        if (current < prev){
            res -= valueMap[s[i]]?:0
        }
        else {
            res += valueMap[s[i]]?:0
        }
            prev = current

    }
    return res

    }
}