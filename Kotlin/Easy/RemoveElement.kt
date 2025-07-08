//Problem's link: https://leetcode.com/problems/remove-element/
/*
* The idea here is to remove in place, cause it is required that you change the given array.
* So create a new index and only increment and set value if not equal the val passed.
*/
fun removeElement(nums: IntArray, `val`: Int): Int {
    var count = 0
    for(value in nums) {
        if(value != `val`) {
            nums[count] = value
            count++
        }
    }
    return count
}