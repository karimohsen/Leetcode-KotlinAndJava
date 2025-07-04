// problems link : https://leetcode.com/problems/minimum-depth-of-binary-tree/
/*
* The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
* So get left and right and return the min.
 */
public int minDepth(TreeNode root) {
	if(root == null)
		return 0;
	// If one of the subtrees is null, we must take the other side
	if(root.left == null)
		return minDepth(root.right) + 1;
	if(root.right == null)
		return minDepth(root.left) + 1;

	// Both children exist
	return Math.min(minDepth(root.right), minDepth(root.left)) + 1;
}