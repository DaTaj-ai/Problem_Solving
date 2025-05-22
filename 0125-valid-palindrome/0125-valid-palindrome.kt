class Solution {
    fun isPalindrome(s: String): Boolean {
        return s.filter { it.isLetter() || it.isDigit() }
            .map { it.lowercase() }
            .let { it == it.reversed()}}}