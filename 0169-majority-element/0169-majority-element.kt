class Solution {
    fun majorityElement(nums: IntArray): Int {

        val countMap = mutableMapOf<Int,Int>()
        
        countMap[nums[0]] = 1

    for(i in 1..nums.size-1){
        if(countMap.keys.contains(nums[i])){
            countMap[nums[i]] =  countMap[nums[i]]!!+1
        }
        else{
            countMap[nums[i]] = 1
        }
    }

    for(i in countMap){
        print("${i.key} , ${i.value}\n")
    }
    val res  = countMap.maxByOrNull { it.value }?.key
    return res ?: 0 
 
    }
}