Given a non-negative number represented as an array of digits,

add 1 to the number ( increment the number represented by the digits ).

The digits are stored such that the most significant digit is at the head of the list.

Example:

If the vector has [1, 2, 3]

the returned vector should be [1, 2, 4]

as 123 + 1 = 124.

 NOTE: Certain things are intentionally left unclear in this question which you should practice asking the interviewer.
For example, for this problem, following are some good questions to ask :
Q : Can the input have 0’s before the most significant digit. Or in other words, is 0 1 2 3 a valid input?
A : For the purpose of this question, YES
Q : Can the output have 0’s before the most significant digit? Or in other words, is 0 1 2 4 a valid output?
A : For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.





public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int s=A.size();
        ArrayList<Integer> B=new ArrayList<Integer>();
        int i=-1;
       for(int j=0;j<s;j++)
        {
        if(A.get(0)==0)
        {
        A.remove(0);
        s--;
        }
        else
        {
            break;
        }
        }
        for( i=s-1;i>0;i--)
        {
            int a=A.get(i);
            if(a!=9)
            {
                a++;
                A.remove(i);
                A.add((i),a);
                break;
            }
            else
            {
                a=0;
                A.remove(i);
                A.add((i),a);
                
            }
        }
            if(i==0)
            {
                int a=A.get(i);
            if(a==9)
            {
                a=0;
                A.remove(i);
                A.add((i),a);
                B.add(1);
                
            }
            else
            {
                 a++;
                A.remove(i);
                A.add((i),a);
            }
           
        }
  
        for(i=0;i<s;i++)
        {
            B.add(A.get(i));
        }
            if(s==0)
      {
          B.add(1);
      }
        return B;
    }
}
