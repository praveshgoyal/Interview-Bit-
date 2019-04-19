A robot is located at the top-left corner of an A x B grid (marked ‘Start’ in the diagram below).

The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked ‘Finish’ in the diagram below).

How many possible unique paths are there?

Note: A and B will be such that the resulting answer fits in a 32 bit signed integer.

Example :

Input : A = 2, B = 2
Output : 2

2 possible routes : (0, 0) -> (0, 1) -> (1, 1) 
              OR  : (0, 0) -> (1, 0) -> (1, 1)
              
              
             cpp
              
              
    
    
    
    
    
    
    
    int Solution::uniquePaths(int A, int B) {
    // Do not write main() function.
    // Do not read input, instead use the arguments to the function.
    // Do not print the output, instead return values as specified
    // Still have a doubt. Checkout www.interviewbit.com/pages/sample_codes/ for more details
    vector<vector<int>> grid(A,vector<int>(B,0));
    if(A==0 && B==0)
        return 1;
    grid[0][0]=1;
    for(int i=0;i<A;i++){
        for(int j=0;j<B;j++){
            if(i-1>=0)
                grid[i][j] += grid[i-1][j];
            if(j-1>=0)
                grid[i][j] += grid[i][j-1];
        }
    }
    
    return grid[A-1][B-1];
}
