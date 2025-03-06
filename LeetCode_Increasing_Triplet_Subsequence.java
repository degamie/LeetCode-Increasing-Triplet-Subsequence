class Solution {
//T(C(N)) and S(C(N) as It Requires Contigous Memory Space Allocation iteratively
    public boolean increasingTriplet(int[] nums) {
        int first=Integer.MAX_VALUE; //Variables Declare
        int Second=Integer.MAX_VALUE;
        for(int n:nums){//Iterating through Nums
            if(first>=n){first=n; }//assigning First Value
                else if(n<=Second){Second=n;}//Assigning Second Val
                else return true;//Printing True
        }return false;//Printing False
    }
}
