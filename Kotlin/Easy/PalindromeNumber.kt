//Problem's link: https://leetcode.com/problems/palindrome-number/

/*
* When it comes to solving this problem, I had 3 solutions in mind:
* 1- The simplest was to change the number into a stringbuilder and use reverse method, then check
* if string equals reversed string.
*
* 2- To convert the num into a string and have two pointers, one at the start and the other at the end.
* Keep moving the pointers and if you don't have a match (strNum.charAt(end) != strNum.charAt(end)) return false
*
* 3- The nerd way, by doing math. ex:- x = 7887 , reserved = 0
* loop 1 reserved = reserved* 10 + num%10 -> 7 , num /= 10 -> 788
* loop 2 reserved = reserved* 10 + num%10 -> 70+ 8 , num /= 10 -> 78
* loop 3 reserved = reserved* 10 + num%10 -> 780 + 8 , num /= 10 -> 7
* loop 4 reserved = reserved* 10 + num%10 -> 7880 + 7 , num /= 10 -> 0
* check if reserved = x
*/

fun isPalindrome(x: Int): Boolean {
    if(x < 0 || x%10 == 0 && x!= 0) return false
    var num = x
    var reversed = 0
    while(num > 0) {
        reversed = reversed * 10 + num%10
        num /= 10
    }
    return reversed == x
}