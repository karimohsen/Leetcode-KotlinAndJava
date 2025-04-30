// Problem's link:https://leetcode.com/problems/plus-one/ 

/*
* The idea here is if the number is less than 9 we can just increment and return the array ex: 877 -> 878
* if it's 9 then it needs to be 0 ex: 89 -> 90
* what if it's 99 ? in that case will be 00 then at the end will create a new array of size +1 the orriginal and set 
* 1 at index 0.
*/
fun plusOne(digits: IntArray): IntArray {
    for(index in digits.indices.reversed()) {
        if(digits[index] != 9) {
            digits[index]++
            return digits
        }
        digits[index] = 0
    }
    val newArr = IntArray(digits.size + 1)
    newArr[0] = 1
    return newArr
}