//Problem's link: https://leetcode.com/problems/binary-tree-inorder-traversal/

/*
* I used recession to solve this problem, basically traverse left till it's null, then
* add the smallest all the way up then go right and do the same, travers left , add , go right
*/
public List<Integer> inorderTraversal(TreeNode root) {
    final List<Integer> res = new ArrayList<>();
    helper(root, res);
    return res;
}

private void helper(TreeNode root, List<Integer> result) {
    if(root != null) {
        helper(root.left, result);
        result.add(root.val);
        helper(root.right, result);
    }
}