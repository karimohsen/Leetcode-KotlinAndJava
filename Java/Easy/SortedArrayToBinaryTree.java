//Problem's link: https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree

/*
 * To create a height-balanced binary search tree (BST) from a sorted array,
 * we need to maintain an equal depth across the tree, so both left and right subtrees are as close in height as possible.
 * The best way to achieve this is by choosing the middle element of the array as the root.
 * Recursively applying this approach ensures the resulting tree is both height-balanced and sorted according to BST properties.
 */

public TreeNode sortedArrayToBST(int[] nums) {
	return buildTreeNode(nums, 0 , nums.length-1);
}

private TreeNode buildTreeNode(int[] nums, int start, int end) {
	if(start > end) {
		return null;
	}
	final int mid = start + (end - start)/2;
	final TreeNode root = new TreeNode(nums[mid]);
	root.left = buildTreeNode(nums, start, mid - 1);
	root.right = buildTreeNode(nums, mid + 1, end);

	return root;
}