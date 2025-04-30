import java.util.*
//Problem link: https://leetcode.com/problems/two-sum/
/*
* The approach i took is to create a map where the value is the key and the index is the value,
* since every value is unique. 
* If the (target - value) exists in the map then return the index of the value and the
* other value of the key (target - value).
*/
fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = nums.withIndex().associate { it.value to it.index }

    for ((index, value) in nums.withIndex()) {
        val secondNumber = target - value
        if(map.containsKey(secondNumber) && map.get(secondNumber) != index) {
            return intArrayOf(index, map.getValue(secondNumber))
        }
    }
    return intArrayOf()
}