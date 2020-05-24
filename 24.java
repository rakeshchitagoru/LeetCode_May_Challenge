/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode bstFromPreorder(int[] preorder) {
        return convertBST(preorder, 0, preorder.length-1);
    }
    public TreeNode convertBST(int[] nums, int low, int high){
        if(low > high)
            return null;
        TreeNode root = new TreeNode(nums[low]);
        int i;
        for(i=low;i<=high;i++){
            if(nums[i] > root.val)
                break;
        }
        root.left = convertBST(nums, low+1, i-1);
        root.right = convertBST(nums, i, high);
        return root;
    }
}