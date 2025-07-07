//Problem's solving: https://leetcode.com/problems/valid-palindrome/description/
/*
* Create two pointers, one in the beginning of the str and the other at the end,move a pointer if it is not an alphanumeric
* (we want to skip any non-alphanumeric character), if both pointers are pointing at an alphanumeric then they need to match
* otherwise it is not a palindrome.
*/
fun isPalindrome(s: String): Boolean {
    var i = 0
    var j = s.length - 1
    while (i < j){
        val firstChar = s[i]
        val secondChar = s[j]
        if(!firstChar.isLetterOrDigit()){
            i++
            continue
        } else if(!secondChar.isLetterOrDigit()){
            j--
            continue
        } else if (firstChar.lowercase() != secondChar.lowercase()){
            return false
        }
        i++
        j--
    }
    return true
}