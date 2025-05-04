//Problem's link: https://leetcode.com/problems/path-sum/

/*
 * Traverse whilst deducting the current val from target, if reached the end check if you reached target
 */

public boolean hasPathSum(TreeNode root, int targetSum) {
    if(root == null) {
        return false;
    }
    if(root.right == null && root.left == null) {
        //since we deduct, if we reach the end we want to check if we reached the target as well
        return targetSum == root.val;
    }
    final boolean leftSum = hasPathSum(root.left, targetSum - root.val);
    final boolean rightSum = hasPathSum(root.right, targetSum - root.val);

    //we don't care if it was the right or the left, as long as we reach the target .. that's why oring
    return leftSum || rightSum;
}