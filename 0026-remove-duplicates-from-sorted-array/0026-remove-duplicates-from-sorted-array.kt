class Solution {
    fun removeDuplicates(nums: IntArray): Int {
    
        var currentElement: Int = nums[0]
        var arrayIndex = 1

        for( i in 1..nums.size-1){
            if(nums[i] != currentElement){
                nums[arrayIndex] = nums[i]
                currentElement = nums[i]
                arrayIndex++
            }
        }
        return arrayIndex 
    }
}