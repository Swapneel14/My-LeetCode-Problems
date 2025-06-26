class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        int n1=num;
        for(int i=1;i<n1;i++){
            if(n1%i==0)sum+=i;
        }
        return sum==num;
    }
}
