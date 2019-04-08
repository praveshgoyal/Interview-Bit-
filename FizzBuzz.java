Fizzbuzz is one of the most basic problems in the coding interview world. Try to write a small and elegant code for this problem. 
Given a positive integer A, return an array of strings with all the integers from 1 to N. 
But for multiples of 3 the array should have “Fizz” instead of the number. 
For the multiples of 5, the array should have “Buzz” instead of the number. 
For numbers which are multiple of 3 and 5 both, the array should have “FizzBuzz” instead of the number.

Look at the example for more details.


Example

A = 5
Return: [1 2 Fizz 4 Buzz]




public class Solution {
    public ArrayList<String> fizzBuzz(int A) {
        
        ArrayList<String> s = new ArrayList<String>();
        
        for(int i=0;i<A;i++)
        {
            if((i+1)%3==0 || (i+1)%5==0 )
            {
                if((i+1)%3==0  && (i+1)%5==0)
                {
                    s.add("FizzBuzz");
                    
                }
              else
              {
               if((i+1)%3==0)
                 s.add("Fizz");
                 
                 else
                  s.add("Buzz");
              }
            }
            else
            {
                String k= Integer.toString(i+1);
                 s.add(k);
            }
            
            
        }
        return s;
    }
}
