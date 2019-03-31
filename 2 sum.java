Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 < index2. Please note that your returned answers (both index1 and index2 ) are not zero-based. 
Put both these numbers in order in an array and return the array from your function ( Looking at the function signature will make things clearer ). Note that, if no pair exists, return empty list.

If multiple solutions exist, output the one where index2 is minimum. If there are multiple solutions with the minimum index2, choose the one with minimum index1 out of them.




/// Brute force
public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> twoSum(final List<Integer> A, int B) {
    ArrayList<Integer> ans=new ArrayList<Integer>();
    int left=0;
    ans.add(A.size()+22);
    ans.add(A.size()+22);
    for(int i=0;i<A.size()-1;i++)
    {   
        left=B-A.get(i);
        for(int j=i+1;j<A.size();j++)
        {
            if(left==A.get(j))
            {
                if(ans.get(1)>(j+1))
                {
                ans.clear();
                ans.add(i+1);
                ans.add(j+1);
                
                }
            }
        }
    }
    if(ans.get(0)==A.size()+22)
    {
        ans.clear();
    }
    return ans;
    }
}





//optimum solution
public class Solution {
	public ArrayList<Integer> twoSum(final List<Integer> a, int b) {
	    
	    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	    
	    ArrayList<Integer> ans = new ArrayList<Integer>();
	    
	    for (int i = 0; i < a.size(); i++){
	        int curr = a.get(i);
	        
	        if (map.containsKey(b-curr)){
	            int index = map.get(b-curr);
	            ans.add(index);
	            ans.add(i + 1);
	            return ans;
	        }else if (!map.containsKey(curr)){
	            map.put(curr, i + 1);
	        }
	    }
	    
	    return ans;
	}
}


