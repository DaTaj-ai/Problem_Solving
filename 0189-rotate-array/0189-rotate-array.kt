class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        
        val n = nums.size
        val steps = k % n

        val result = mutableListOf<Int>()
        result.addAll(nums.slice(n - steps until n))  
        result.addAll(nums.slice(0 until n - steps))  

        for (i in nums.indices) {
            nums[i] = result[i]
        }

    }
}