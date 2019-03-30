/*  Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? 
Find all unique triplets in the array which gives the sum of zero.
*/
//Java


public class Solution{
    public static ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> a) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(a.size() < 3)
            return result;
        Collections.sort(a);
        
        for(int i =0; i < a.size()-2; i++){
            if(i == 0 || a.get(i) > a.get(i-1)){
                int negate = -a.get(i);
                int start = i+1;
                int end = a.size()-1;
                while(start < end){
                    if(a.get(start) + a.get(end) == negate){
                        ArrayList<Integer> temp = new ArrayList<Integer>();
                        temp.add(a.get(i));
                        temp.add(a.get(start));
                        temp.add(a.get(end));
                        result.add(temp);
                        
                        start++;
                        end--;
                        
                        while(start < end && a.get(end) == a.get(end +1))
                            end--;
                        while(start < end && a.get(start) == a.get(start -1))
                            start++;                                                          
                    }
                    else if((a.get(start) + a.get(end)) < negate){
                        start++;
                    }
                    else {
                        end--;
                    }
                }
            }
        }
        return result;
    }
    }


