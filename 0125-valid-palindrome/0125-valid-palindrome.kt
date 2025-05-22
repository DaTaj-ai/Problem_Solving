class Solution {
    fun isPalindrome(s: String): Boolean {
            var lowerCaseWords = ""
    for(i in s ){
        if (i.toInt() >= 'A'.toInt() && i.toInt() <= 'Z'.toInt() || i.toInt() >= 'a'.toInt() && i.toInt() <= 'z'.toInt()|| i.isDigit()){
            lowerCaseWords+=i.lowercase()
        }
    }

    if (lowerCaseWords == lowerCaseWords.reversed()){
        return true 
    }
    else{
        return  false 
    }
        
    }
}