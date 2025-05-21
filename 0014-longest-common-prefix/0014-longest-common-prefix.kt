class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
         var result = ""

    for ( i in 0 until strs[0].length){
        for ( j in strs ){
            if (i >= j.length  || j[i] != strs[0][i]){
                return result
            }

        }
        result+= strs[0][i]
    }
    return result 
    }
}