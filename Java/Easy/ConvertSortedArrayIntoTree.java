// problems link : https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/
/*
* Since the array is already sorted, consider the middle element the root and the
* left side to be from index 0 to mid -1 , and the right the side to be from mid + 1 to array size -1.
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