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
    public boolean isValidSequence(TreeNode root, int[] arr) {
        return checkPath(root,arr,0);
    }
    
    private static boolean checkPath(TreeNode root, int[] arr, int position){
        if(root == null || position == arr.length)
            return false;
        
        if(root.left==null && root.right==null && root.val == arr[position] && position == arr.length-1)
            return true;
        return root.val == arr[position] && checkPath(root.left,arr,position+1) || checkPath(root.right,arr,position+1);
    }
}