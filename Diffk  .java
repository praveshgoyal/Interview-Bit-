*/
Given an array ‘A’ of sorted integers and another non negative integer k, find if there exists 2 indices i and j such that A[i] - A[j] = k, i != j.

Example:-
input:-
 A : [1 3 5] 
    k : 4
    
     Output : YES as 5 - 1 = 4 
Return 0 / 1 ( 0 for false, 1 for true ) for this problem

Try doing this in less than linear space complexity.


*/


//Java

public class Solution {
    public int diffPossible(ArrayList<Integer> A, int B) {
        int l =0;
        int r=1;
        while(r<A.size())
        {
        if(A.get(r)-A.get(l)==B)
        return 1;
        
        else
        {
            if(A.get(r)-A.get(l)>B)
            {
            l++;
            if(r==l)
            r++;
            }
            else
            r++;
        }
        }
        return 0;
    }
}



