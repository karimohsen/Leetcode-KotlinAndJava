//Problem's link: https://leetcode.com/problems/majority-element/description/
/*
* I created a map with every number as a key and the count as value, then I searched this map for
* a key with value greater that half the array's size.
*/
fun majorityElement(nums: IntArray): Int {
    val targetNum = nums.size/2
    val numberToCountMap = mutableMapOf<Int, Int>()

    for (number in nums)
        numberToCountMap.put(number, numberToCountMap.getOrDefault(number, 0)+1)

    return numberToCountMap.entries.find { entry -> entry.value > targetNum }!!.key
}