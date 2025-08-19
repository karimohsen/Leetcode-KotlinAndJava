//Problem's link: https://leetcode.com/problems/happy-number/

/*
* The idea here is simple:
* 1- create a set for the numbers that you had (to avoid infinite loops).
* 2- for every number get all the digits and square them and add them together
* 3- the new number is the result of step 2, keep repeating till you reach one or you cant add the number to your set(already exists).
*/
fun isHappy(n: Int): Boolean {
    var num = n
    val usedNumber= mutableSetOf<Int>()
    while (num != 1){
        var result = 0
        while (num > 0){
            val digit = num%10
            result += digit*digit
            num /= 10
        }
        num = result
        if(!usedNumber.add(num)) //Cant add then break
            break
    }
    return num == 1
}