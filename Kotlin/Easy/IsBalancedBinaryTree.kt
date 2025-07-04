// problems link : https://leetcode.com/problems/balanced-binary-tree/description/
/*
* A tree is considered balanced if A height-balanced binary tree is a binary tree
* in which the depth of the two subtrees of every node never differs by more than one.
*
*
* The approach that I took here is to create another method to calculate the depth of a node,
* then check that every node is balanced recursively.
*/

fun isBalanced(root: TreeNode?): Boolean {
    if (root == null)
        return true
    val leftHand = getHeight(root.left)
    val rightHand = getHeight(root.right)

    if(abs(leftHand - rightHand) > 1)
        return false
    return isBalanced(root.right) && isBalanced(root.left)
}

fun getHeight (root: TreeNode?): Int {
    if(root == null)
        return 0

    val leftHand = getHeight(root.left)
    val rightHand = getHeight(root.right)

    return maxOf(leftHand, rightHand) + 1
}