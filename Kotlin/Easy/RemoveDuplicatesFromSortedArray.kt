//Problem's link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

/*
* We have to change the values inside the array, so create a counter 
* and only update if the previous is not the same as current.
*/
fun removeDuplicates(nums: IntArray): Int {
    var count = 0
    for((index, value) in nums.withIndex()) {
        if(index != 0) {
            if(nums[index-1] != nums[index]) {
                nums[count] = value
                count++
            }
        } else {
            nums[count] = value
            count++
        }
    }
    return count
}