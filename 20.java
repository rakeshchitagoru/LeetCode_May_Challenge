class Solution {
    int count = 0;
    int curr = 0;
    public int kthSmallest(TreeNode root, int k) {
//         List<Integer> list = new ArrayList<>();
//         list = inOrder(root, list);
//         return list.get(k-1);
//     }
    
//     public List inOrder(TreeNode curr, List<Integer> list){
//         if(curr != null){
//             inOrder(curr.left, list);
//             list.add(curr.val);
//             inOrder(curr.right, list);
//         }
//         return list;
        if(root != null){
            kthSmallest(root.left, k);
            count++;
            if(count == k)
                curr = root.val;
            kthSmallest(root.right, k);
        }
        return curr;
        
    }
}