//Problem's solving: https://leetcode.com/problems/single-number/description/
/*
* There were two solutions that came to mind when trying to solve this assignment:
* 1- To create a map for the number and the count of occurrence, and I return the number that has only one occurrence since it is guaranteed.
* 2- To use xor
*/
fun singleNumber(nums: IntArray): Int {
    /*
    The XOR operation has two useful properties:

    ( x \oplus x = 0 ): XORing a number with itself results in 0.
    ( x \oplus 0 = x ): XORing a number with 0 keeps the number unchanged.
    By XORing all elements in the array, the elements that appear twice will cancel each other out, leaving only the single element that appears once.
     */
    var result = 0
    for (number in nums)
        result = result xor number

    return result
}