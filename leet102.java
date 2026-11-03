
class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public void resta(TreeNode node, int level) {

        if (node == null) {
            return;
        }

        if (ans.size() == level) {
            ans.add(new ArrayList<Integer>());
        }

        ans.get(level).add(node.val);

        if (node.left != null) {
            resta(node.left, level + 1);
        }

        if (node.right != null) {
            resta(node.right, level + 1);
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {

        if (root == null) {
            return ans;
        }

        resta(root, 0);

        return ans;
    }
}
