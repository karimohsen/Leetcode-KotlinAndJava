//Problem's link: https://leetcode.com/problems/symmetric-tree

/*
 * Symmetric tree if when traversing left and right elements you get the same values,
 * so it's the same traversing technique used in the uploaded code {@link  BinaryTreeInorderTraversal.kt} ish
 * the difference is you pass two values at the same time to check left vs right.
 */
fun isSymmetric(root: TreeNode?): Boolean {
    return checkLeftAndRight(root?.left, root?.right)
}

fun checkLeftAndRight(left: TreeNode?,right: TreeNode?): Boolean {
    if(left == null && right == null) {
        return true
    } else if(left == null || right == null || left.`val` != right.`val`) {
        return false
    }
    return checkLeftAndRight(left.left,right.right) && checkLeftAndRight(left.right, right.left)
}