A robot is located at the top-left corner of an A x B grid (marked ‘Start’ in the diagram below).


The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked ‘Finish’ in the diagram below).

How many possible unique paths are there?

Note: A and B will be such that the resulting answer fits in a 32 bit signed integer



Example :

Input : A = 2, B = 2
Output : 2

2 possible routes : (0, 0) -> (0, 1) -> (1, 1) 
              OR  : (0, 0) -> (1, 0) -> (1, 1)


java

public class Solution {
    public int uniquePaths(int A, int B) {
        int ans=1;
        int y=0;
           long a=1;
            long b=1;
        if(A==0 || B==0)
        {
            ans=1;
        }
        else
        {
            int t=A+B-2;
        
            if(A>=B)
             y=B-1;
             
             else
             y=A-1;
         
                for(int i=1;i<=y;i++)
                {
                    a=a*(t-(i-1));
                    b=b*(i);
                }
               
                ans=(int)(a/b);
        }
        return ans;
    }
}
