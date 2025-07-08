//Problem's link: https://leetcode.com/problems/binary-tree-postorder-traversal/
/*
 * Quite a straight forward problem, you can read more about tree traversal here:
 * https://www.geeksforgeeks.org/dsa/tree-traversals-inorder-preorder-and-postorder/
 */
public List<Integer> postorderTraversal(TreeNode root) {
	final List<Integer> numsList = new ArrayList<>();

	addToList(root, numsList);
	return numsList;
}

private void addToList(TreeNode treeNode, List<Integer> list){
	if(treeNode == null)
		return;
	addToList(treeNode.left,list);
	addToList(treeNode.right,list);
	list.add(treeNode.val);
}
