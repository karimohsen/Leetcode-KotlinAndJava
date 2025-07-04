// problems link : https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/
/*
* Since the array is already sorted, consider the middle element the root and the
* left side to be from index 0 to mid -1 , and the right the side to be from mid + 1 to array size -1.
*/
fun sortedArrayToBST(nums: IntArray): TreeNode? {
    return buildBST(nums, 0, nums.size - 1)
}

fun buildBST(nums: IntArray, startElement: Int, endElement: Int): TreeNode? {
    if(startElement > endElement) {
        return null
    }
    val mid = startElement + (endElement - startElement)/2;
    val root = TreeNode(nums[mid])
    root.left = buildBST(nums, startElement, mid - 1)
    root.right = buildBST(nums, mid + 1, endElement)
    return root
}