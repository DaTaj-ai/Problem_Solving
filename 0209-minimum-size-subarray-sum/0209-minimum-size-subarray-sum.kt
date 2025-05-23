class Solution {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        
var minNumber = Int.MAX_VALUE
    var l = 0
    var total = 0


    for(right in nums.indices){
        total +=nums[right]
        while ( total >= target){
            minNumber = min( minNumber , (right) - (l) +1)
            total -= nums[l]
            l++
        }
    }

    return if (minNumber == Int.MAX_VALUE)  0 else minNumber 
    
    }
}