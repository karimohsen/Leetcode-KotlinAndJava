//Problem's link: https://leetcode.com/problems/symmetric-tree

/*
 * Symmetric tree if when traversing left and right elements you get the same values,
 * so it's the same traversing technique used in the uploaded code {@link  BinaryTreeInorderTraversal.kt} ish
 * the difference is you pass two values at the same time to check left vs right.
 */

public boolean isSymmetric(TreeNode root) {
    return checkRightAndLeft(root.left, root.right);
}

private boolean checkRightAndLeft(TreeNode left, TreeNode right) {
    if(left == null && right == null) {
        return true;
    } else if(left == null || right == null || left.val != right.val) {
        return false;
    }
    return checkRightAndLeft(left.left, right.right) && checkRightAndLeft(left.right, right.left);
}