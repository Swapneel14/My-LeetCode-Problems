class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int i=0,j=people.length-1;
        Arrays.sort(people);
        int ans=0;
        while(i<=j){
           if(people[i]+people[j]<=limit){
            i++;
            j--;
           }
           else{
            j--;
           }

           ans++;
        }
        return ans;
    }
}
