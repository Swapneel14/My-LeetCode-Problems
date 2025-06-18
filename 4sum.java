class Solution {
    public List<List<Integer>> fourSum(int[] arr, int t) {
        Arrays.sort(arr);
        List<List<Integer>>ans= new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(i>0&&arr[i]==arr[i-1])continue;
            for(int j=i+1;j<n;j++){
                if(j>i+1&&arr[j]==arr[j-1])continue;
                int p=j+1;
                int q=n-1;
               
                while(p<q){
                long sum = (long) arr[i] + arr[j] + arr[p] + arr[q];
                    if(sum>t)q--;
                    else if(sum<t)p++;
                    else{
                        List<Integer> a = Arrays.asList(arr[i], arr[j], arr[p], arr[q]);
                        ans.add(a);
                        p++; q--;
                        while(p<q&&arr[p]==arr[p-1]){
                            p++;

                        }
                    }
                }
            }
        }
        return ans;
    }
}
