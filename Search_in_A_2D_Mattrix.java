class Solution {//Leetcode-->Medium //Goood Approach TC-O(N)+O(LogM)
    public boolean searchMatrix(int[][] m, int target) {
        int n=m.length;
        int k=m[0].length;
        for(int i=0;i<n;i++){
            if(m[i][0]<=target&&m[i][k-1]>=target) return search(m[i],target);
        }
        return false;
    }
    public boolean search(int arr[],int x){
        int n=arr.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(arr[mid]==x)return true;
            else if(arr[mid]>x)high=mid-1;
            else low=mid+1;
        }
        return false;
    }
 
    public boolean searchMatrix(int[][] mat, int target) {//Optimum Aproach TC--O(log(n*m))
        int n=mat.length;
        int m=mat[0].length;
       int low=0, high=n*m-1;
       while(low<=high){
        int mid=low+(high-low)/2;
        int row=mid/m;
        int col=mid%m;
        if(mat[row][col]==target)return true;
        else if(mat[row][col]>target)high=mid-1;
        else low=mid+1;
       }
       return false;
    }
    


}
