//Problem's link: https://leetcode.com/problems/binary-tree-preorder-traversal/description/
/*
* Quite a straight forward problem, you can read more about tree traversal here:
* https://www.geeksforgeeks.org/dsa/tree-traversals-inorder-preorder-and-postorder/
*/
fun preorderTraversal(root: TreeNode?): List<Int> {
    val numbersList = mutableListOf<Int>()
    traversTreeAndAddToList(root, numbersList)
    return numbersList
}

fun traversTreeAndAddToList(root: TreeNode?, list: MutableList<Int>) {
    if(root == null)
        return
    list.add(root.`val`)
    traversTreeAndAddToList(root.left, list)
    traversTreeAndAddToList(root.right, list)
}