// problems link : https://leetcode.com/problems/balanced-binary-tree/description/
/*
* A tree is considered balanced if A height-balanced binary tree is a binary tree
* in which the depth of the two subtrees of every node never differs by more than one.
*
*
* The approach that I took here is to create another method to calculate the depth of a node,
* then check that every node is balanced recursively.
*/
public boolean isBalanced(TreeNode root) {
	if(root == null)  {
		return true;
	}
	int leftHeight = getHeight(root.left);
	int rightHeight = getHeight(root.right);
	if(Math.abs(leftHeight - rightHeight) > 1)
		return false;

	return isBalanced(root.right) && isBalanced(root.left);
}


public int getHeight(TreeNode node){
	if(node == null)
		return 0;
	final int leftHeight = getHeight(node.left);
	final int rightHeight = getHeight(node.right);

	return Math.max(leftHeight,rightHeight) + 1;
}