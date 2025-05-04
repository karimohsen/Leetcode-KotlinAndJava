//Problem's link: https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree

/*
 * To create a height-balanced binary search tree (BST) from a sorted array,
 * we need to maintain an equal depth across the tree, so both left and right subtrees are as close in height as possible.
 * The best way to achieve this is by choosing the middle element of the array as the root.
 * Recursively applying this approach ensures the resulting tree is both height-balanced and sorted according to BST properties.
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