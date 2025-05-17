class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
           
            var lastNum1:Int = m-1
            var lastNum2:Int = n-1
            var lastArray:Int = m+n-1
            
            while(lastNum2>=0 ){
                if( lastNum1 >= 0 && nums1[lastNum1] > nums2[lastNum2] ){
                    
                nums1[lastArray--] = nums1[lastNum1] 
                    lastNum1--
                }
                else{
                    nums1[lastArray--] = nums2[lastNum2]  
                    lastNum2-- 
                }
                 

            }
    }
}