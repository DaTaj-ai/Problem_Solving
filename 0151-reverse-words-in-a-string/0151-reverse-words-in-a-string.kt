class Solution {
    fun reverseWords(s: String): String {

        return  s.trim().split(" ").reversed().filter{it != ""}.joinToString(" ")
            }
}