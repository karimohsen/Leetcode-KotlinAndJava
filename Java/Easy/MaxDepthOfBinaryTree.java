//Problem's link: https://leetcode.com/problems/maximum-depth-of-binary-tree

/*
 * Same traversing technique used in the uploaded code {@link  BinaryTreeInorderTraversal.kt} ish
 * it's really hard to explain recursion but the idea here is, traverse left and count , traverse right and count
 * Get the max between them cause that's the longest.
 */

public int maxDepth(TreeNode root) {
    if(root == null) {
        return 0;
    }
    int left = maxDepth(root.left);
    int right = maxDepth(root.right);
    return Math.max(left, right) + 1 ;
}