/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxheight=0;
    public int diameterOfBinaryTree(TreeNode root) {
        getheight(root);
        return maxheight;
    }
    private int getheight(TreeNode root){
        if(root==null) return 0;
        int heightleft=getheight(root.left);
        int heightright=getheight(root.right);

        maxheight=Math.max(maxheight,heightleft+heightright);
        return 1 + Math.max(heightleft,heightright);
    }
}
