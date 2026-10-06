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
    public int countNodes(TreeNode root) {

        if (root == null){
            return 0;
        }

        int left = 0;
        int right = 0;

        TreeNode temp = root;
        while (temp != null) {
            left++;
            temp = temp.left;
        }

        temp = root;
        while (temp != null) {
            right++;
            temp = temp.right;
        }

        if (left == right) {
            return (1 << left) - 1;
        }

        return 1 + countNodes(root.left) + countNodes(root.right);




    }
}