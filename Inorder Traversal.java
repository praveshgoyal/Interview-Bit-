Given a binary tree, return the inorder traversal of its nodes’ values.

Example :
Given binary tree

   1
    \
     2
    /
   3
return [1,3,2].

Using recursion is not allowed.

Time Complexity:O(n)
Space Complexity:O(n)

java





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
public class Solution
{
    public ArrayList<Integer> inorderTraversal(TreeNode A) {
        ArrayList<Integer> res=new ArrayList<Integer>();
        Stack<TreeNode> s=new Stack<TreeNode>();
        TreeNode currentNode =A;
        boolean done=false;
        while(!done)
        {
            if(currentNode!=null)
            {
                s.push(currentNode);
                currentNode=currentNode.left;
            }
            else
            {
                if(s.isEmpty())
                {
                done=true;
                }
                else
                {
                    currentNode=s.pop();
                    res.add(currentNode.val);
                    currentNode=currentNode.right;
                }
            }
        }
        return res;
    }
}
