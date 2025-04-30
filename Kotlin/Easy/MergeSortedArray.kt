//Problem's link: https://leetcode.com/problems/merge-sorted-array/description/

/*
* The approach I took here is to start from the end of the two arrays and add at the end as well
*/

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    var tailNum1 = m-1
    var tailNum2 = n-1
    var total = (n+m)-1

    while(tailNum1 >= 0 && tailNum2 >= 0) {
        nums1[total--] = if(nums1[tailNum1] > nums2[tailNum2]) nums1[tailNum1--] else nums2[tailNum2--]
    }

    while(tailNum2 >= 0)
        nums1[total--] = nums2[tailNum2--]
}


