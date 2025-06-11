class Solution {//Leetcode-->Hard
    public int findMin(int[] arr) {
        int n= arr.length;
        if(n==1)return arr[0];
        int low=0;
        int end=n-1;
        while(low<=end){
            int mid=(low+end)/2;
            if(low==end)return arr[low];
             if ((mid == 0 || arr[mid - 1] > arr[mid]) &&
                (mid == n - 1 || arr[mid + 1] >= arr[mid])) {
                return arr[mid];
            }

            if (arr[mid] < arr[end]) {
                end = mid;
            } else if (arr[mid] > arr[end]) {
                low = mid + 1;
            } else {
               
                end--;
            }

        }
        return arr[low];
    }
}
