//Problem's link: https://leetcode.com/problems/path-sum/

/*
 * Traverse whilst deducting the current val from target, if reached the end check if you reached target
 */
fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
    if (root == null) {
        return false
    }
    if(root.left == null && root.right == null) {
        //since we deduct, if we reach the end we want to check if we reached the target as well
        return targetSum == root.`val`
    }
    val hasLeftPathSum = hasPathSum(root.left, targetSum - root.`val`)
    val hasRightPathSum = hasPathSum(root.right, targetSum - root.`val`)

    //we don't care if it was the right or the left, as long as we reach the target .. that's why or-ing
    return hasLeftPathSum || hasRightPathSum
}