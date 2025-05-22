class Solution {
    fun strStr(haystack: String, needle: String): Int { 
        val result = -1

    if(needle.length > haystack.length){
        return result 
    }

    for(i in haystack.indices){
        for (j in needle.indices){
            // if  we in last element in needle so return
            // or if two words not match
            // or match but not the last element
        
            if (haystack.length-1 < i+j  || needle[j] != haystack[i+j] ){
                break
            }
            else if (needle[j] == haystack[i+j] && j == (needle.length-1) ){
                return i 
            }
        }
    }
        return result 
    }
}