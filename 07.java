class Solution {
    public boolean isCousins(TreeNode root, int x, int y) {
        System.out.println(root.val);
        if(root.left!= null && root.right !=null)
        return check(root.left,root.right,x,y);
        else if(root.left!=null)
            return isCousins(root.left,x,y);
            else if(root.right !=null)
                return isCousins(root.right,x,y);
            else 
                return false;
        
        
    }
    public boolean check(TreeNode le, TreeNode ri,int x,int y){
    System.out.println(le.val+"   "+ri.val);
        if((le.left!= null && (le.left.val==x||le.left.val==y) )||(le.right !=null && (le.right.val==x||le.right.val==y))){
            if((ri.left !=null && (ri.left.val==x||ri.left.val==y)) ||(ri.right !=null && (ri.right.val==x||ri.right.val==y))){
                return true;
            }}else{
               if (le.left!=null && le.right!= null && check(le.left,le.right,x,y))  return true;
                if    (le.left!=null && ri.left!= null && check(le.left,ri.left,x,y)) return true;
                 if   (le.left!= null && ri.right!= null && check(le.left,ri.right,x,y)) return true;
                  if  (le.right!= null && ri.left!= null && check(le.right,ri.left,x,y)) return true;
                  if  (le.right!= null && ri.right!= null && check(le.right,ri.right,x,y)) return true;
                  if  (ri.left!= null && ri.right!= null && check(ri.left,ri.right,x,y)) return true;
               
                
                if(ri.right!=null) return isCousins(ri.right,x,y);
                if(ri.left!=null) return isCousins(ri.left,x,y);
                 if(le.left!=null) return isCousins(le.left,x,y);
                if(le.right!=null) return isCousins(le.right,x,y);
            }
        
               return false;
        
    }
}