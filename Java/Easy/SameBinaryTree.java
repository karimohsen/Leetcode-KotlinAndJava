//Problem's link: https://leetcode.com/problems/same-tree/

/*
* Same tree if all elements are the same, so it's the same traversing technique used in
* the uploaded code {@link  BinaryTreeInorderTraversal.java}.
*/
public boolean isSameTree(TreeNode p, TreeNode q) {
    if(p == null && q == null) {
        return true;
    } else if(p == null || q == null || p.val != q.val) {
        return false;
    }
    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
}