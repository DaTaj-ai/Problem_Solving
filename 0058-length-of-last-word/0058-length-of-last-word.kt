class Solution {
    fun lengthOfLastWord(s: String): Int {   
        val arr =  s.trim().split(" ")
        return arr[arr.size-1].length
    }
}