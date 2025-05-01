//Problem's link: https://leetcode.com/problems/binary-tree-inorder-traversal/

/*
* I used recession to solve this problem, basically traverse left till it's null, then
* add the smallest all the way up then go right and do the same, travers left , add , go right
*/
fun inorderTraversal(root: TreeNode?): List<Int> {
    val res = mutableListOf<Int>()
    helper(root, res)
    return res
}

fun helper(root: TreeNode?, res: MutableList<Int>) {
    if(root != null) {
        helper(root.left, res)
        res.add(root.`val`)
        helper(root.right, res)
    }
}