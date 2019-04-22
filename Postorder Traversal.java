Given a binary tree, return the postorder traversal of its nodes’ values.

Example :

Given binary tree

   1
    \
     2
    /
   3
return [3,2,1].

Using recursion is not allowed.






//java






/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
public class Solution {
    public ArrayList<Integer> postorderTraversal(TreeNode A) {
        ArrayList<Integer> res=new ArrayList<Integer>();
        if(A==null)
        return res;
        
        Stack<TreeNode> s=new Stack<TreeNode>();
        s.push(A);
        TreeNode pre=null;
        while(!s.isEmpty())
        {
            TreeNode curr=s.peek();
            if(pre==null || pre.left==curr || pre.right==curr)
            {
                if(curr.left!=null)
                s.push(curr.left);
                else if(curr.right!=null)
                s.push(curr.right);
                
            }
            else if(curr.left==pre)
            {
                if(curr.right!=null)
                s.push(curr.right);
            }
            else
            {
                res.add(curr.val);
                s.pop();
            }
            pre=curr;
        }
        
        return res;
    }
}
