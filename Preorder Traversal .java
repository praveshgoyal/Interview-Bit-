Given a binary tree, return the preorder traversal of its nodes’ values.

Example :
Given binary tree

   1
    \
     2
    /
   3
return [1,2,3].

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
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        ArrayList<Integer> res=new ArrayList<Integer>();
        if(A==null)
        return res;
        Stack<TreeNode> s=new Stack<TreeNode>();
        s.push(A);
        while(!s.isEmpty())
        {
            TreeNode temp=s.pop();
            res.add(temp.val);
            if(temp.right!=null)
            s.push(temp.right);
            if(temp.left!=null)
            s.push(temp.left);
            
        }
        return res;
        
    }
}
