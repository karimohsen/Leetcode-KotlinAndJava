//Problem's solving: https://leetcode.com/problems/climbing-stairs/
/*
* This problem is really fun, if the input is 1 the output is 1
* if the input is 2 the output is 2
* if the input is 3 the output is 3
* if the input is 4 the output is 5
* if the input is 5 the output is 8
* That's a just fibonacci sequence in disguise!!
*/
fun climbStairs(n: Int): Int {
    var res = 0
    var firstNum = 0
    var secondNum = 1
    var loopCount = n
    while (loopCount > 0) {
        res = firstNum + secondNum
        firstNum = secondNum
        secondNum = res
        loopCount--
    }
    return res
}