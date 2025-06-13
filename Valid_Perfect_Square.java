class Solution {//Leetcode-->Easy
    public boolean isPerfectSquare(int n) {
        if(n<0)return false;
        if(n==0||n==1)return true;
        long low =1;
        long high=n/2;
        while(low<=high){
            long mid=low+(high-low)/2;
            if(mid*mid==n)return true;
            else if(mid*mid<n)low=mid+1;
            else{
                high=mid-1;
            }
        }
        return false;
    }
}
